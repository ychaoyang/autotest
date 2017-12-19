package com.autotest.annotation;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by yu on 17/12/6.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
