package belajar.spring.pustaka.dao;

import java.util.List;

import belajar.spring.pustaka.model.BorrowingBook;

public interface BorrowingDao {
	
	public List<BorrowingBook> listBorrow();
	public void saveOrUpdate(BorrowingBook borrowingBook);
	public void delete(int id);
	public BorrowingBook getById(int id);
	public BorrowingBook getBookofMember(int idMember);
}
