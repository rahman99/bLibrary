package belajar.spring.pustaka.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import belajar.spring.pustaka.model.Member;
import belajar.spring.pustaka.service.MemberService;

@Controller
public class MemberController {

	private static Logger logger = Logger.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberService;	
	
	@RequestMapping(value = "/Members", method = RequestMethod.GET)
	public ModelAndView handleRequest() throws Exception {
		logger.debug("/Users  executed");
		List<Member> listUsers = memberService.list();
		
		ModelAndView model = new ModelAndView("member/MemberList");
		model.addObject("member", listUsers);
		return model;
	}
	
	@RequestMapping(value = "/newMember", method = RequestMethod.GET)
	public ModelAndView newUser() {
		logger.debug("/newUser executed");
		ModelAndView model = new ModelAndView("member/MemberForm");
		model.addObject("member", new Member());
		return model;		
	}
	
	@RequestMapping(value = "/editMember", method = RequestMethod.GET)
	public ModelAndView editUser(HttpServletRequest request) {
		logger.debug("/editUser executed");
		int userId = Integer.parseInt(request.getParameter("id"));
		Member member = memberService.get(userId);
		ModelAndView model = new ModelAndView("member/MemberForm");
		model.addObject("member", member);
		return model;		
	}
	
	@RequestMapping(value = "/deleteMember", method = RequestMethod.GET)
	public ModelAndView deleteUser(@ModelAttribute Member member) {
		logger.debug("/deleteUser executed");
		memberService.delete(member);
		return new ModelAndView("redirect:/Members");		
	}
	
	@RequestMapping(value = "/saveMember", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Member user) {
		logger.debug("/saveUser executed");
		memberService.saveOrUpdate(user);
		
		return new ModelAndView("redirect:/Members");
	}
}
