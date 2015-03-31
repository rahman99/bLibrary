package belajar.spring.pustaka.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import belajar.spring.pustaka.dao.UserLoginDao;
import belajar.spring.pustaka.model.UserLogin;

@Repository
public class UserLoginDaoImpl implements UserLoginDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<UserLogin> list() {
		@SuppressWarnings("unchecked")
		List<UserLogin> list = (List<UserLogin>) sessionFactory.getCurrentSession()
				.createCriteria(UserLogin.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
	}

	@Transactional
	public void saveOrUpdate(UserLogin userLogin) {
//		sessionFactory.getCurrentSession().saveOrUpdate(userLogin);
		userLogin.setPassword(new BCryptPasswordEncoder().encode(userLogin.getPassword()));
		sessionFactory.getCurrentSession().saveOrUpdate(userLogin);
	}

	@Transactional
	public void delete(int id) {
		UserLogin loginDelete = new UserLogin();
		loginDelete.setId(id);
		sessionFactory.getCurrentSession().delete(loginDelete);
	}

	@Transactional
	public UserLogin getById(int id) {
		String hql = "from UserLogin where id="+id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<UserLogin> list = query.list();
		if(list!=null && !list.isEmpty()){
			return list.get(0);
		}
		
		return null;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
