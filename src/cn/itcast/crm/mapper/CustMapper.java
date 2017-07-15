package cn.itcast.crm.mapper;

import java.util.List;

import cn.itcast.crm.pojo.Cust;
import cn.itcast.crm.pojo.QueryVo;

public interface CustMapper {

	/***
	 * 查询所有
	 */
	public List<Cust> findall(QueryVo queryVo);
	/**
	 * 按id删除
	 */
	public void delete(Long id);
	/**
	 * 保存
	 */
	public void insert(Cust cust);
	/***
	 * 添加
	 * @param cust
	 */
	public void add(Cust cust);
	
}
