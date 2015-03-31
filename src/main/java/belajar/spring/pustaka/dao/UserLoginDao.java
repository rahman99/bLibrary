package belajar.spring.pustaka.dao;

import java.util.List;

import belajar.spring.pustaka.model.UserLogin;

public interface UserLoginDao {

	public List<UserLogin> list();
	public void saveOrUpdate(UserLogin userLogin);
	public void delete(int id);
	public UserLogin getById(int id);
}
