package belajar.spring.pustaka.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import belajar.spring.pustaka.dao.BorrowingDao;
import belajar.spring.pustaka.model.BorrowingBook;

@Repository
public class BorrowingDaoImpl implements BorrowingDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<BorrowingBook> listBorrow() {
		@SuppressWarnings("unchecked")
		List<BorrowingBook> list = (List<BorrowingBook>) sessionFactory.getCurrentSession()
				.createCriteria(BorrowingBook.class);
		return list;
	}

	@Transactional
	public void saveOrUpdate(BorrowingBook borrowingBook) {
		sessionFactory.getCurrentSession().saveOrUpdate(borrowingBook);
	}

	@Transactional
	public void delete(int id) {
		BorrowingBook borrowing=new BorrowingBook();
		borrowing.setId(id);
		sessionFactory.getCurrentSession().delete(borrowing);
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

	@Override
	public BorrowingBook getBookofMember(int idMember) {
//		String hql = "from BorrowingBook where"
		return null;
	}

}
