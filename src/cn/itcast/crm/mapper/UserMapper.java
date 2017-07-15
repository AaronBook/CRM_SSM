package cn.itcast.crm.mapper;

import java.util.List;

import cn.itcast.crm.pojo.User;

public interface UserMapper {

	/***
	 * 根据账号密码验证
	 */
	public List<User> login(User user);
	
	/***
	 * 查询所有
	 * @return
	 */
	public List<User> querAll();
}
