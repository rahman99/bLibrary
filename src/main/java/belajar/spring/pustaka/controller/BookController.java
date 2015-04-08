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

import belajar.spring.pustaka.model.Book;
import belajar.spring.pustaka.service.BookService;

@Controller
public class BookController {

	private static Logger logger = Logger.getLogger(BookController.class);

	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/listBooks", method = RequestMethod.GET)
	public ModelAndView handleBookRequest() throws Exception {
		logger.debug("/listBooks executed");
		List<Book> listBooks = bookService.listBook();
//		ModelAndView model = new ModelAndView("book/BookList");
		ModelAndView model = new ModelAndView("book/BookList2"); //tambahan
		model.addObject("bookList", listBooks);
		model.addObject("book", new Book()); //tambahan
		return model;
	}
	
	@RequestMapping(value = "/newBook", method = RequestMethod.GET)
	public ModelAndView newBook() {
		logger.debug("/newBook executed");
		ModelAndView model = new ModelAndView("book/BookForm");
		model.addObject("book", new Book());
		return model;
	}
	
	@RequestMapping(value = "/saveBook", method = RequestMethod.POST)
	public ModelAndView saveBook(@ModelAttribute Book book) {
		logger.debug("/saveBook executed");
		bookService.saveOrUpdate(book);
		return new ModelAndView("redirect:/Books");
	}
	
	@RequestMapping(value = "/editBook", method = RequestMethod.GET)
	public ModelAndView editBook(HttpServletRequest request) {
		logger.debug("/editBook executed");
		int bookId = Integer.parseInt(request.getParameter("id"));
		Book book = bookService.getById(bookId);
		ModelAndView model = new ModelAndView("book/BookForm");
		model.addObject("book", book);
		return model;		
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteBook(@ModelAttribute Book book) {
		logger.debug("/deleteBook executed");
		bookService.delete(book);
		return new ModelAndView("redirect:/listBooks");		
	}
}
