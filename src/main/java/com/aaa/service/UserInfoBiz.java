package com.aaa.service;

import java.util.List;

import com.aaa.entity.MyCondition;
import com.aaa.entity.UserInfo;

public interface UserInfoBiz {
	List<UserInfo>findAllUser();
	/*List<UserInfo>findAllUserCondition(MyCondition condition);
	void addUser(UserInfo user);
	void eaddUser2(UserInfo user);*/

	void addUser(UserInfo user);
}
