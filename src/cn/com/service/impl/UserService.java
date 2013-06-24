package cn.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.dao.IUserDao;
import cn.com.entity.User;
import cn.com.service.IUserService;

@Service("userService")
// 声明此类为业务逻辑层的类
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;

	public void save(User user) {
		userDao.save(user);
	}

}
