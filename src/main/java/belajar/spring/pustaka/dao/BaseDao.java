package belajar.spring.pustaka.dao;

import java.util.List;

public interface BaseDao<T> {

	public List<T> list();
	public void save(T entity);
	public void saveOrUpdate(T entity);
	public void delete(T entity);
}
