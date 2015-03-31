package belajar.spring.pustaka.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import belajar.spring.pustaka.dao.UserRoleDao;
import belajar.spring.pustaka.model.UserRole;

@Repository
public class UserRoleDaoImpl implements UserRoleDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(UserRole userrole) {
		sessionFactory.getCurrentSession().saveOrUpdate(userrole);
	}

}
