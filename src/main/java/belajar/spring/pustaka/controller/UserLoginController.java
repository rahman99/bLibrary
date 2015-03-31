package belajar.spring.pustaka.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import belajar.spring.pustaka.dao.UserLoginDao;
import belajar.spring.pustaka.dao.UserRoleDao;
import belajar.spring.pustaka.model.UserLogin;
import belajar.spring.pustaka.model.UserRole;

@Controller
public class UserLoginController {

	@Autowired
	private UserLoginDao userloginDao;
	
	@Autowired
	private UserRoleDao userRoleDao;
	
	public UserLoginDao getUserloginDao() {
		return userloginDao;
	}

	public void setUserloginDao(UserLoginDao userloginDao) {
		this.userloginDao = userloginDao;
	}

	@RequestMapping(value = "/userLogin", method=RequestMethod.GET)
	public ModelAndView listUserLogin() throws Exception{
		List<UserLogin> listUserlogin = userloginDao.list();
		ModelAndView model = new ModelAndView("administrator/userlogin");
		model.addObject("userloginlist", listUserlogin);
		return model;		
	}
	
	@RequestMapping(value = "/newUserLogin", method=RequestMethod.GET)
	public ModelAndView newUserLogin(){
		ModelAndView model = new ModelAndView("administrator/userloginform");
		model.addObject("userlogin", new UserLogin());
		return model;
	}
	
	@RequestMapping(value = "/saveUserLogin", method = RequestMethod.POST)
	public ModelAndView saveUserLogin(@ModelAttribute UserLogin userLogin, @ModelAttribute UserRole userrole){
		userloginDao.saveOrUpdate(userLogin);
		userRoleDao.saveOrUpdate(userrole);
		return new ModelAndView("redirect:/userLogin");
	}
	
	@RequestMapping(value = "/editUserLogin", method=RequestMethod.GET)
	public ModelAndView editUserLogin(HttpServletRequest request){
		int id = Integer.parseInt(request.getParameter("id"));
		UserLogin userlogin = userloginDao.getById(id);
		ModelAndView model = new ModelAndView("administrator/userloginform");
		model.addObject("userlogin", userlogin);
		return model;
	}
	
	@RequestMapping(value = "/deleteUserLogin", method=RequestMethod.GET)
	public ModelAndView deleteUserLogin(HttpServletRequest request){
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("nilai id: "+id);
		userloginDao.delete(id);
		return new ModelAndView("redirect:/userLogin");
	}
	
}

