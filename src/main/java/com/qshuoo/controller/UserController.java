package com.qshuoo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qshuoo.pojo.User;

/**
 * 模拟 user 控制器
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/api/v1")
public class UserController {

	/**
	 * 模拟获取所有user
	 */
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String listUser() {
		// 这里返回所有的user
		System.out.println("获取所有user");
		return "success";
	}

	/**
	 * 模拟根据id获取user
	 * 
	 * @param id
	 */
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public String getUserById(@PathVariable("id") Long id) {
		// 这里返回user
		System.out.println("根据获取user，id=" + id);
		return "success";
	}

	/**
	 * 模拟添加用户
	 * 
	 * @param user
	 * @throws IOException 
	 */
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public void saveUser(User user, HttpServletResponse res) throws IOException {
		// 这里保存用户
		System.out.println("添加用户 " + user);
		res.getWriter().write("hello");
	}

	/**
	 * 模拟更新用户，更新全部字段
	 * 
	 * @param user
	 */
	@RequestMapping(value = "users", method = RequestMethod.PUT)
	public String updateUser(User user) {
		// 这里更新用户，更新全部字段
		System.out.println("更新用户全部字段" + user);
		return "success";
	}

	/**
	 * 根据id更新用户密码
	 * 
	 * @param id
	 * @param pwd
	 */
	@RequestMapping(value = "users/{id}/{pwd}", method = RequestMethod.PATCH)
	public String updateUserPwdById(@PathVariable("id") Long id, @PathVariable("pwd") String pwd) {
		// 这里根据用户id更新密码
		System.out.println("根据id更新用户密码" + "id=" + id + ",pwd=" + pwd);
		return "success";
	}

	/**
	 * 根据id删除用户
	 * 
	 * @param id
	 */
	@RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
	public String deleteUserById(@PathVariable("id") Long id) {
		// 这里根据id删除用户
		System.out.println("根据id删除用户id=" + id);
		return "success";

	}

}
