package belajar.spring.pustaka.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import belajar.spring.pustaka.dao.BaseDao;

@Repository
@Transactional
public class BaseDaoImpl<T> implements BaseDao<T> {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Class<T> genericType = null;
	
	@SuppressWarnings("unchecked")
	public Class<T> getType(){
		if(genericType==null){
			ParameterizedType type = (ParameterizedType) this.getClass()
					.getGenericSuperclass();
			genericType = (Class<T>) type.getActualTypeArguments()[0];
		}
		return genericType;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> list() {
		List<T> list = (List<T>) sessionFactory.getCurrentSession()
				.createCriteria(getType())
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
				.list();
		return list;
	}

	@Override
	public void saveOrUpdate(T entity) {
		sessionFactory.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(T entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}

}
