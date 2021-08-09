package com.seo.myapp.users;

import java.util.List;

public interface UsersService {
	public void insertUsers(UsersVO vo);
	public void updateUsers(UsersVO vo);
	
	public void deleteUsers(UsersVO vo);
	public List<UsersVO> findId(UsersVO vo);
	public UsersVO getUsers(UsersVO vo);
	public List<UsersVO> findPw(UsersVO vo);
	
	
}	
