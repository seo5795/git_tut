package com.seo.myapp.users.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seo.myapp.users.UsersService;
import com.seo.myapp.users.UsersVO;

@Service("UsersService")
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDAO usersDAO;
	
	@Override
	public void insertUsers(UsersVO vo) {
		// TODO Auto-generated method stub
		usersDAO.insertUsers(vo);
	}

	@Override
	public UsersVO getUsers(UsersVO vo) {
		// TODO Auto-generated method stub
		return usersDAO.getUsers(vo);
	}

	@Override
	public void updateUsers(UsersVO vo) {
		// TODO Auto-generated method stub
		usersDAO.updateUsers(vo);
	}

	@Override
	public void deleteUsers(UsersVO vo) {
		// TODO Auto-generated method stub
		usersDAO.deleteUsers(vo);
	}


	
}
