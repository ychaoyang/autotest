package com.autotest.extension;

import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.util.StringUtils;

import java.text.MessageFormat;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

/**
 * Created by huairen on 2017/7/17.
 */
public class AutoTestNameFormatter {
    private final String namePattern;

    AutoTestNameFormatter(String namePattern) {
        this.namePattern = namePattern;
    }

    String format(int invocationIndex, Object... arguments) {
        String pattern = prepareMessageFormatPattern(invocationIndex, arguments);
        Object[] humanReadableArguments = makeReadable(arguments);
        return formatSafely(pattern, humanReadableArguments);
    }

    private String prepareMessageFormatPattern(int invocationIndex, Object[] arguments) {
        String result = namePattern.replace("{index}", String.valueOf(invocationIndex));
        if (result.contains("{arguments}")) {
            // @formatter:off
            String replacement = IntStream.range(0, arguments.length)
                    .mapToObj(index -> "{" + index + "}")
                    .collect(joining(", "));
            // @formatter:on
            result = result.replace("{arguments}", replacement);
        }
        return result;
    }

    private Object[] makeReadable(Object[] arguments) {
        // Note: humanReadableArguments must be an Object[] in order to
        // avoid varargs issues with non-Eclipse compilers.
        Object[] humanReadableArguments = new String[arguments.length];
        for (int i = 0; i < arguments.length; i++) {
            humanReadableArguments[i] = StringUtils.nullSafeToString(arguments[i]);
        }
        return humanReadableArguments;
    }

    private String formatSafely(String pattern, Object[] arguments) {
        try {
            return MessageFormat.format(pattern, arguments);
        } catch (IllegalArgumentException ex) {
            String message = "The naming pattern defined for the parameterized tests is invalid. "
                    + "The nested exception contains more details.";
            throw new JUnitException(message, ex);
        }
    }

}