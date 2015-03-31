package belajar.spring.pustaka.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import belajar.spring.pustaka.dao.MemberDao;
import belajar.spring.pustaka.model.Member;
import belajar.spring.pustaka.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDao memberDao;

	public MemberDao getMemberDao() {
		return memberDao;
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public List<Member> list() {
		return memberDao.list();
	}

	@Override
	public void saveOrUpdate(Member member) {
		memberDao.saveOrUpdate(member);
	}

	@Override
	public void delete(Member member) {
		memberDao.delete(member);
	}

	@Override
	public Member get(int id) {
		return memberDao.get(id);
	}

}
