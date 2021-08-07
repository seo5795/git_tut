package com.seo.myapp.users;

public interface UsersService {
	void insertUsers(UsersVO vo);
	void updateUsers(UsersVO vo);
	
	void deleteUsers(UsersVO vo);
	UsersVO findId(UsersVO vo);
	UsersVO getUsers(UsersVO vo);
	
	
}	
