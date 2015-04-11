package belajar.spring.pustaka.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import belajar.spring.pustaka.dao.BookDao;
import belajar.spring.pustaka.model.Book;

@Repository
@Transactional
public class BookDaoImpl extends BaseDaoImpl<Book> implements BookDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Book getById(int id) {
		/*String hql = "from Book where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Book> listBook = (List<Book>) query.list();
		
		if (listBook != null && !listBook.isEmpty()) {
			return listBook.get(0);
		}
		
		return null;*/
		Session session = sessionFactory.getCurrentSession();
		Book book=(Book) session.get(Book.class, id);
		return book;
	}

	public Book getByISBN(String isbn) {
		String hql = "from Book where bookISBN like '"+ isbn+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		System.out.println("Query is "+ query +"Query list size is "+query.list().size());
		
		if(query != null && query.list().size() > 0) {
			@SuppressWarnings("unchecked")
			List<Book> listBook = (List<Book>) query.list();
			
			if (listBook != null && !listBook.isEmpty()) {
				return listBook.get(0);
			}
		}
		return null;
	}

}
