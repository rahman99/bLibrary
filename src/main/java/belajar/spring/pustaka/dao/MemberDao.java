package belajar.spring.pustaka.dao;

import belajar.spring.pustaka.model.Member;

public interface MemberDao extends BaseDao<Member>{
	
	public Member get(int id);
	
}
