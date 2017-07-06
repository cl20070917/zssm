package com.zhijia.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhijia.dao.IUserDao;
import com.zhijia.entity.User;
import com.zhijia.service.IUserService;


@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
