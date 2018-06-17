package com.org.app.mapper;

import java.util.List;

import com.org.app.vo.User;

public interface MbeDao {
	public List<User> getUserList(User user) throws Exception;
}
