package belajar.spring.pustaka.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import belajar.spring.pustaka.model.BorrowingBook;
import belajar.spring.pustaka.service.BorrowingBookService;

@Controller
public class BorrowingController {

	@Autowired
	private BorrowingBookService borrowingBookService;
	
	@RequestMapping(value = "/saveBorrow", method = RequestMethod.POST)
	public ModelAndView saveBorrowing(@ModelAttribute BorrowingBook borrow) throws Exception{
		borrowingBookService.saveOrUpdate(borrow);
		return new ModelAndView("redirect:/borrowing");
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "borrowingby")
	public ModelAndView getListBorrowingByMember(HttpServletRequest req){
		int idMember = Integer.parseInt(req.getParameter("id"));
		List<BorrowingBook> listborrowing = (List<BorrowingBook>) borrowingBookService.getBookBorrowingByMember(idMember);
		ModelAndView model = new ModelAndView("borrowing/listborowing");
		model.addObject("borrowingbymember", listborrowing);
		return model;
	}
}
