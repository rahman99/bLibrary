package belajar.spring.pustaka.service;

import java.util.List;

import belajar.spring.pustaka.model.Book;

public interface BookService {

	public List<Book> listBook();
	public void save(Book book);
	public void saveOrUpdate(Book book);
	public void delete(Book book);
	public Book getById(int id);
	public Book getByISBN(String isbn);
}
