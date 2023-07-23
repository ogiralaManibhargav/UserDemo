package com.spring.crud.service;

import java.util.List;

import com.spring.crud.entity.User;
import com.spring.crud.request.UserRequest;

public interface UserService {

	User addUser(UserRequest userRequest);

	User findById(Long id);

	List<User> findALLUserList();

}
