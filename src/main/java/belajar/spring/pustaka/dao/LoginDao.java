package belajar.spring.pustaka.dao;

import belajar.spring.pustaka.model.UserLogin;

public interface LoginDao {
	UserLogin findByUserName(String username);
	
}
