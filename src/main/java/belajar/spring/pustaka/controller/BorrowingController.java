package belajar.spring.pustaka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import belajar.spring.pustaka.dao.BorrowingDao;
import belajar.spring.pustaka.model.BorrowingBook;

@Controller
public class BorrowingController {

	@Autowired
	private BorrowingDao borrowingDao;
	
	@RequestMapping(value = "/borrowing")
	public ModelAndView getListBook() throws Exception{
//		List<BorrowingBook> 
		return null;
	}
}
