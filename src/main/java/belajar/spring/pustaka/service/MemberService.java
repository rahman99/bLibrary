package belajar.spring.pustaka.service;

import java.util.List;

import belajar.spring.pustaka.model.Member;

public interface MemberService {

	public List<Member> list();
	public void saveOrUpdate(Member member);
	public void delete(Member member);
	public Member get(int id);
}
