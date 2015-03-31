package belajar.spring.pustaka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application about page.
 */
@Controller
public class AboutController {
	
	private static final Logger logger = LoggerFactory.getLogger(AboutController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/about")
	public String about() {
		logger.info("About page !");
		
		return "about";
	}
	
	
}
