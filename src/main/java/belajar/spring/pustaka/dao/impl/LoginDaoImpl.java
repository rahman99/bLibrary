package belajar.spring.pustaka.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import belajar.spring.pustaka.dao.LoginDao;
import belajar.spring.pustaka.model.UserLogin;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao{
	
	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public UserLogin findByUserName(String username) {
		session = sessionFactory.openSession();
		tx = session.getTransaction();
		session.beginTransaction();
		UserLogin user = (UserLogin) session.load(UserLogin.class, new String(username));
		tx.commit();
		return user;
	}

}
