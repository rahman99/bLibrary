package belajar.spring.pustaka.dao;

import belajar.spring.pustaka.model.BorrowingBook;

public interface BorrowingBookDao extends BaseDao<BorrowingBook>{
	
	public BorrowingBook getById(int id);
	public BorrowingBook getBookBorrowingByMember(int idMember);
}
