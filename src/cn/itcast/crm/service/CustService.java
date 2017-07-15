package cn.itcast.crm.service;

import java.util.List;

import cn.itcast.crm.pojo.Cust;
import cn.itcast.crm.pojo.QueryVo;

public interface CustService {
	/***
	 * 查询所有
	 */
	public List<Cust> findall(QueryVo queryVo);
	/**
	 * 按id删除
	 */
	public void delete(Long id);
	/***
	 * 添加
	 * @param cust
	 */
	public void add(Cust cust);
}
