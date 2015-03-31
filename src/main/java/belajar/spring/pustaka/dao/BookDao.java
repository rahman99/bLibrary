package belajar.spring.pustaka.dao;

import belajar.spring.pustaka.model.Book;

public interface BookDao extends BaseDao<Book> {

	public Book getById(int id);
	public Book getByISBN(String isbn);
}
