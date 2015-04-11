package belajar.spring.pustaka.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import belajar.spring.pustaka.dao.BookDao;
import belajar.spring.pustaka.model.Book;
import belajar.spring.pustaka.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<Book> listBook() {
		return bookDao.list();
	}

	@Override
	public void saveOrUpdate(Book book) {
		bookDao.saveOrUpdate(book);
	}

	@Override
	public void delete(Book book) {
		bookDao.delete(book);
	}

	@Override
	public Book getById(int id) {
		return bookDao.getById(id);
	}

	@Override
	public Book getByISBN(String isbn) {
		return bookDao.getByISBN(isbn);
	}

	@Override
	public void save(Book book) {
		bookDao.save(book);
	}

}
