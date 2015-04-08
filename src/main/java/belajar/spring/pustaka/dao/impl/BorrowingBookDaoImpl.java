package belajar.spring.pustaka.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import belajar.spring.pustaka.dao.BorrowingBookDao;
import belajar.spring.pustaka.model.BorrowingBook;

@Repository
public class BorrowingBookDaoImpl extends BaseDaoImpl<BorrowingBook> implements BorrowingBookDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public BorrowingBook getById(int id) {
		String hql = "from BorrowingBook where id ="+id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<BorrowingBook> list = query.list();
		
		if(list != null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public BorrowingBook getBookBorrowingByMember(int idMember) {
		String hql = "from BorrowingBook where isReturn = false and idMember = "+idMember;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		if(query!=null && query.list().size() > 0) {
			List<BorrowingBook> list = (List<BorrowingBook>) query.list();
			if(list != null && !list.isEmpty()){
				return list.get(0);
			}
		}
		return null;
	}

}
