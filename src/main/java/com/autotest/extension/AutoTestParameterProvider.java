package com.autotest.extension;

import com.autotest.annotation.AutoTest;
import com.autotest.mybatis.Dalgen;
import com.autotest.utils.ProcessObject;
import com.autotest.utils.StringUtils;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.AnnotationConsumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author huairen
 * Created on 18/4/2.
 */
public class AutoTestParameterProvider implements ArgumentsProvider, AnnotationConsumer<AutoTest> {

	private String file;
	private String project;
	private List<Object[]> objects;

	@Override
	public void accept(AutoTest autoTest) {
		this.file = autoTest.file();
		this.project = autoTest.project();
		this.objects = new ArrayList<>();
	}


	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		//生成mybatis代码
		if (StringUtils.isNotBlank(this.project)) {
			Dalgen dalgen = new Dalgen();
			dalgen.gen(this.project);
		}
		List<Object> args = DataDeal.getParams(context, this.file);
		for (Object ob : args) {
			HashMap<String, String> map = (HashMap) ob;
			List<Parame> pars = DataDeal.getVariables(context);
			Object[] obs = new Object[pars.size()];
			for (int i = 0; i < pars.size(); i++) {
				Parame p = pars.get(i);
				Class cl = p.getType();
				if (DataDeal.isJavaClass(cl) || cl.isEnum()) {
					obs[i] = ProcessObject.processing(cl, map.get(p.getName()));
				} else {
					obs[i] = DataDeal.mapToObject(map, cl, p.getName());
				}
			}
			objects.add(obs);
		}
		return objects.stream().map(AutoTestParameterProvider::toArguments);
	}

	private static Arguments toArguments(Object item) {
		if (item instanceof Arguments) {
			return (Arguments) item;
		}
		if (item instanceof Object[]) {
			return Arguments.of((Object[]) item);
		}
		return Arguments.of(item);
	}


}
