package com.sldt.mds.dmc.mp.service;

import java.util.List;
import java.util.Map;

import com.sldt.framework.common.PageResults;
import com.sldt.mds.dmc.mp.vo.MetadataDatabaseVO;

public interface MetadataService {

	/**
	 * 根据参数获取元数据数据库对象
	 * @param params
	 * @return
	 */
	public List<MetadataDatabaseVO> getMetadataDatabase(PageResults page); 
	/**
	 * 根据元数据DBID获取当前生产版本信息
	 * @param page
	 * @return
	 */
	public List<Map<String,Object>> getProMetaByDbId(PageResults page);
	/**
	 * UAT版本
	 * @param page
	 * @return
	 */
	public List<Map<String, Object>> getUatMetaByDbId(PageResults page);
	/**
	 * 根据用户输入模糊破匹配字段级数据
	 * @param page
	 * @return
	 */
	public List<Map<String, Object>> getColumnAutoComplete(PageResults page);
	/**
	 * 根据用户输入模糊匹配表级数据
	 * @param page
	 * @return
	 */
	public List<Map<String, Object>> getTableAutoComplete(PageResults page);
}
