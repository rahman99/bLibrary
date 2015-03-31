package belajar.spring.pustaka.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import belajar.spring.pustaka.dao.ReversionDao;
import belajar.spring.pustaka.model.ReversionBook;

@Repository
public class ReversionDaoImpl implements ReversionDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<ReversionBook> listReversion() {
		@SuppressWarnings("unchecked")
		List<ReversionBook> list = (List<ReversionBook>) sessionFactory.getCurrentSession()
				.createCriteria(ReversionBook.class);
		return list;
	}

	@Override
	public void saveOrUpdate(ReversionBook reversionBook) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public ReversionBook getById(int id) {
		String hql = "from ReversionBook where id ="+id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<ReversionBook> list = query.list();
		
		if(list != null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

}
