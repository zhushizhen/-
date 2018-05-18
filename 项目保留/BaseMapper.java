package com.jsyl.stjnfw.lib.db.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jsyl.stjnfw.lib.bean.BaseExample;

public interface BaseMapper<T,ID extends Serializable> {
    public int countByExample(BaseExample example);
    public int deleteByExample(BaseExample example);
    public int deleteByPrimaryKey(Object id);
    public int insert(T record);
    public int insertSelective(T record);
    public List<T> selectByExample(BaseExample example);
    public T selectByPrimaryKey(Object id);
    public int updateByExampleSelective(@Param("record") T record, @Param("example") BaseExample example);
    public int updateByExample(@Param("record") T record, @Param("example") BaseExample example);
    public int updateByPrimaryKeySelective(T record);
    public int updateByPrimaryKey(T record);
    public List<T> selectByPageWithExample(BaseExample example);
}