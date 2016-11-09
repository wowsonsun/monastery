package com.wowson.service;

import java.util.List;

import com.wowson.model.User;

public interface UserService {
	public int insertUser(User user);
	public List<User> findAllUser();
	public int deleteUser(String id);
	public int updateUser(User user);
	public User findAllUserById(String id);
}
