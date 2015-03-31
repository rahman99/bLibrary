package belajar.spring.pustaka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {

	@RequestMapping(value="/home")
	public String homePage()
	{
		return "utama"; //nama jsp
	}
	
	@RequestMapping(value="/loginfailed")
	public String loginFailed(ModelMap model)
	{
		model.addAttribute("error","Incorrect Username Or Password");
		return "utama";
	}
}
