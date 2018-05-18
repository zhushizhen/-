package com.jsyl.stjnfw.lib.db.dao;

import java.util.List;

import com.jsyl.stjnfw.lib.bean.Call;

public interface CallMapper extends BaseMapper<Call, String> {
	/**
	 * 返回当日最大的callcode的后四位
	 *  若是当日没有生成呼叫，则返回null
	 */
	List<String> selectMaxCode();
}
