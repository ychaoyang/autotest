package com.autotest.extension;

import com.autotest.annotation.AutoTest;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.AnnotationConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by ychaoyang on 2017/7/14.
 */
public class CsvFileProvider implements ArgumentsProvider, AnnotationConsumer<AutoTest> {
    private static final Logger logger = LoggerFactory.getLogger(CsvFileProvider.class.getName());
    private String file;
    private Charset charset;


    public void accept(AutoTest annotation) {
        this.file = annotation.file();
        this.charset = Charset.forName(annotation.encoding());
    }

    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        String[] args = DataDeal.getParams(context, this.file);
        CsvParserSettings settings = new CsvParserSettings();
        settings.getFormat().setDelimiter(',');
        settings.getFormat().setQuote('\'');
        settings.getFormat().setQuoteEscape('\'');
        settings.setAutoConfigurationEnabled(false);
        CsvParser csvParser = new CsvParser(settings);
        return Arrays.stream(args).map(csvParser::parseLine).map(Arguments::of);
    }

}

