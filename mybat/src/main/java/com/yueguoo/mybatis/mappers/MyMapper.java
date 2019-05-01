package com.yueguoo.mybatis.mappers;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author shkstart
 * @create 2019-04-27 13:47
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
