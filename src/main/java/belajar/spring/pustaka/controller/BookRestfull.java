package belajar.spring.pustaka.controller;

import java.util.List;
import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import belajar.spring.pustaka.model.Book;
import belajar.spring.pustaka.service.BookService;

/*
 * untuk membuat output json maka wajib ada jackson di lib pom.xml
 */

@RestController //jika mennggunakan @RestController maka tidak wajib ada @ResponseBody
@Controller
@RequestMapping("/rest")
public class BookRestfull {
	
	private Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();

	@Autowired
	private BookService bookserviceRest;
	
	public BookService getBookserviceRest() {
		return bookserviceRest;
	}

	public void setBookserviceRest(BookService bookserviceRest) {
		this.bookserviceRest = bookserviceRest;
	}

	@RequestMapping(value = "/book.json", method=RequestMethod.GET)
//	@ResponseBody
	public List<Book> getAll(){
		List<Book> list = bookserviceRest.listBook();
		return list;
	}
	
	@RequestMapping(value = "/book.json/{id}", method = RequestMethod.GET)
//	@ResponseBody
	public Book getBookbyID(@PathVariable("id") int id){
		
		Book book = null;
		try {
			book = bookserviceRest.getById(id);			
		} catch (Exception e) {
			Validate.isTrue(book != null, "unable to find id : "+ book.getId());			
		}
		return book;
	}
	
	@RequestMapping(value = "/savebook.json", method=RequestMethod.POST)
//	@ResponseBody
	public String saveBook(@RequestBody String json){
		String status = null;
		try {
			Book book = gson.fromJson(json, Book.class);
			bookserviceRest.save(book);
			status = "berhasil";			
		} catch (Exception e) {
			status = "gagal";
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return gson.toJson(status);
	}
	
	@RequestMapping(value="/updatebook.json", method=RequestMethod.POST)
	public String updateBook(@RequestBody String json){
		String status = null;
		Book book = gson.fromJson(json, Book.class);
		try {
			if(bookserviceRest.getById(book.getId()) != null){
				bookserviceRest.saveOrUpdate(book);
				status = "sukses update";
			} 
		} catch (Exception e) {
			status = "gagal update";
			e.printStackTrace();
		}
		return status;
	}
	
	@RequestMapping(value = "/delete.json/{id}", method=RequestMethod.DELETE)
//	@ResponseBody
	public String deleteBook(@PathVariable("id") int id){
		String status = null;
		Book book = bookserviceRest.getById(id);
		try {
			if(bookserviceRest.getById(id) == null){
				status = "id tidak ada";
			} else {
				bookserviceRest.delete(book);
				status = "delete berhasil";
			}
		} catch (Exception e) {
			status = "gagal delete";
			e.printStackTrace();
		}
		return gson.toJson(status);
	}
}
