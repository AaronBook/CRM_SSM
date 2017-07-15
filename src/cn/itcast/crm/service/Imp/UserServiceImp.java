package cn.itcast.crm.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.crm.mapper.UserMapper;
import cn.itcast.crm.pojo.User;
import cn.itcast.crm.service.UserService;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> login(User user) {
		return this.userMapper.login(user);
	}

	@Override
	public List<User> querAll() {
		return this.userMapper.querAll();
	}

}
