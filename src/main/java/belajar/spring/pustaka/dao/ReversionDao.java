package belajar.spring.pustaka.dao;

import java.util.List;

import belajar.spring.pustaka.model.ReversionBook;

public interface ReversionDao {

	public List<ReversionBook> listReversion();
	public void saveOrUpdate(ReversionBook reversionBook);
	public void delete(int id);
	public ReversionBook getById(int id);
}
