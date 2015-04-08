package belajar.spring.pustaka.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import belajar.spring.pustaka.dao.BorrowingBookDao;
import belajar.spring.pustaka.model.BorrowingBook;
import belajar.spring.pustaka.service.BorrowingBookService;

@Service("borrowingBookService")
public class BorrowingBookServiceImpl implements BorrowingBookService{
	
	@Autowired
	private BorrowingBookDao borrowingBookDao;

	public BorrowingBookDao getBorrowingBookDao() {
		return borrowingBookDao;
	}

	public void setBorrowingBookDao(BorrowingBookDao borrowingBookDao) {
		this.borrowingBookDao = borrowingBookDao;
	}

	@Override
	public List<BorrowingBook> getAll() {
		return borrowingBookDao.list();
	}

	@Override
	public void saveOrUpdate(BorrowingBook borrowingBook) {
		borrowingBookDao.saveOrUpdate(borrowingBook);
	}

	@Override
	public BorrowingBook getById(int id) {
		return borrowingBookDao.getById(id);
	}

	@Override
	public BorrowingBook getBookBorrowingByMember(int idMember) {
		return borrowingBookDao.getBookBorrowingByMember(idMember);
	}

}
