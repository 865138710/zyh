package com.aaa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.UserInfoDao;
import com.aaa.entity.MyCondition;
import com.aaa.entity.UserInfo;
import com.aaa.service.UserInfoBiz;

@Service
public class UserInfoImpl implements UserInfoBiz {
	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public List<UserInfo> findAllUser() {
		return userInfoDao.findAllUser();
	}

	/*@Override
	public List<UserInfo> findAllUserCondition(MyCondition condition) {
		return userInfoDao.findAllUserCondition(condition);
	}

	@Override
	public void addUser(UserInfo user) {
		userInfoDao.addUser( user);//法第一个人的工资
		int a=1/0;
		user.setId(user.getId()+1);
		user.setUsername("老王隔壁的");
		userInfoDao.addUser( user);//法第二个人的工资

	}*/
	@Override
	public void addUser(UserInfo user) {
		userInfoDao.addUser( user);
	}

}
