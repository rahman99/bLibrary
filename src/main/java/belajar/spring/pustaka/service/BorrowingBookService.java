package belajar.spring.pustaka.service;

import java.util.List;

import belajar.spring.pustaka.model.BorrowingBook;

public interface BorrowingBookService {

	public List<BorrowingBook> getAll();
	public void saveOrUpdate(BorrowingBook borrowingBook);
	public BorrowingBook getById(int id);
	public BorrowingBook getBookBorrowingByMember(int idMember);
}
