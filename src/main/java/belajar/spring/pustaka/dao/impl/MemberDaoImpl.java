package belajar.spring.pustaka.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import belajar.spring.pustaka.dao.MemberDao;
import belajar.spring.pustaka.model.Member;

@Repository
@Transactional
public class MemberDaoImpl extends BaseDaoImpl<Member> implements MemberDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public Member get(int id) {
		String hql = "from Member where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Member> listMember = (List<Member>) query.list();
		
		if (listMember != null && !listMember.isEmpty()) {
			return listMember.get(0);
		}
		
		return null;
	}

}
