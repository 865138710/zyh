package com.aaa.dao;

import com.aaa.entity.MyCondition;
import com.aaa.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoDao {
	List<UserInfo> findAllUser();

	void addUser(UserInfo user);
	/*List<UserInfo>findAllUserCondition(MyCondition condition);
	void addUser(UserInfo user);*/
}
