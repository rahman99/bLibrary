package belajar.spring.pustaka.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import belajar.spring.pustaka.model.Book;
import belajar.spring.pustaka.service.BookService;

/*
 * untuk membuat output json maka wajib ada jackson di lib pom.xml
 */

//@RestController //jika mennggunakan @RestController maka tidak wajib ada @ResponseBody
@Controller
public class BookRestfull {

	@Autowired
	private BookService bookserviceRest;
	
	public BookService getBookserviceRest() {
		return bookserviceRest;
	}

	public void setBookserviceRest(BookService bookserviceRest) {
		this.bookserviceRest = bookserviceRest;
	}

	@RequestMapping(value = "/book.json", method=RequestMethod.GET)
	@ResponseBody
	public List<Book> getAll(){
		List<Book> list = bookserviceRest.listBook();
		return list;
	}
	
	@RequestMapping(value = "/book.json/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Book getBookbyID(@PathVariable("id") int id){
		Map<Integer, Book> bookdata = new HashMap<Integer, Book>();
		return bookdata.get(id);
	}
	
	@RequestMapping(value = "/savebook.json", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void saveBook(@RequestBody Book book){
		try {
			bookserviceRest.saveOrUpdate(book);
//			Map<Integer, Book> bookdata = new HashMap<Integer, Book>();
//			bookdata.put(book.getId(), book);			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	@RequestMapping(value = "/delete.json", method=RequestMethod.DELETE)
	@ResponseBody
	public Book deleteBook(Book idBook){
		Map<Integer, Book> bookdata = new HashMap<Integer, Book>();
		Book book = bookdata.get(idBook.getId());
		bookdata.remove(idBook.getId());
		return book;
	}
}
