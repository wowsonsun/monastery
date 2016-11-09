package com.wowson.dao;


import java.util.List;

import com.wowson.model.User;
public interface UserDao {
	/**
	 * 添加新用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	public List<User> findAllUser();
	public User findAllUserById(String id);
	public int deleteUser(String id);
	public int updateUser(User user);
	
}
