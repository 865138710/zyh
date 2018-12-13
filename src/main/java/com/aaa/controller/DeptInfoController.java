package com.aaa.controller;

import com.aaa.entity.MyCondition;
import com.aaa.entity.UserInfo;
import com.aaa.service.UserInfoBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author TeacherChen
 * @description 用户业务控制器
 * @company AAA软件
 * @classname Qy87
 * 2018-11-21上午10:03:48
 */
@SuppressWarnings("all")
@Controller
@RequestMapping("/userinfo")//窄化请求
public class DeptInfoController {
	@Autowired
	private UserInfoBiz userInfoImpl;

	/**
	 * 添加用户
	 */
	@RequestMapping("/addUser")
	public  String  addUser(UserInfo user) {
		userInfoImpl.addUser(user);
		return "showUserElementUI";
	}/**
	 * 添加用户跳转
	 */
	@RequestMapping("/toAddUser")
	public  String  toAddUser() {
		return "addUserInfo";
	}
	/**
	 * 请求toShowUserElementUI路径，跳转至element测试页面
	 * @return
	 */
	@RequestMapping("/toShowUserElementUI")
	public String toShowUserElementUI(){
		return "showUserElementUI";
	}

	@RequestMapping("/findAllUserJson")
	@ResponseBody
	public List<UserInfo>  findAllUserJson() {
		List<UserInfo> userList = userInfoImpl.findAllUser();
		return userList;
	}
	/**
	 * 
	 *TODO 按照条件查询
	 *@param session
	 *@return
	 *2018-11-23上午9:54:01
	 */
	/*@RequestMapping("/findAllUserCondition")
	public String findAllUserCondition(HttpSession session,MyCondition condition) {
		List<UserInfo> userList = userInfoImpl.findAllUserCondition(condition);
		session.setAttribute("userList", userList);
		return "showUser";
		
	}
	@RequestMapping("/toAddUserPage")
	public  String  toAddUserPage() {
		return "addUser";
	}
	@RequestMapping("/addUser")
	public  String  addUser(UserInfo user) {
		userInfoImpl.eaddUser2(user);
		return "redirect:findAllUser.do";
	}*/

}
