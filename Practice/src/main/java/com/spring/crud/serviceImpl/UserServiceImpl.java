package com.spring.crud.serviceImpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.entity.User;
import com.spring.crud.repository.UserRepository;
import com.spring.crud.request.UserRequest;
import com.spring.crud.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(UserRequest userRequest) {
		User user = new User();
		if (userRequest != null) {
			BeanUtils.copyProperties(userRequest, user);
			return userRepository.save(user);

		}
		return user;

	}

	@Override
	public User findById(Long id) {

		return userRepository.findById(id).get();
	}

	@Override
	public List<User> findALLUserList() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
