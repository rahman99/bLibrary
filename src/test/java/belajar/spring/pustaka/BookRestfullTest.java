package belajar.spring.pustaka;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import belajar.spring.pustaka.model.Book;

public class BookRestfullTest {
	
	public static final String server_url = "http://localhost:8080/pustaka/";

	public static void main(String[] args) {
		try {
//			testGetAllBook();
			testSaveBook();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("terjadi kesalahan !!!!");
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void testGetAllBook(){
		RestTemplate restTemplate = new RestTemplate();
		List<LinkedHashMap> books = restTemplate.getForObject(server_url+"book.json", List.class);
		System.out.println("jumlah record buku : "+books.size());
		for(LinkedHashMap map:books){
			System.out.println("ID "+map.get("id")+" book : "+map.get("title"));
		}
	}
	
	private static void testSaveBook(){
		RestTemplate restTemplate = new RestTemplate();
		Book book = new Book();
		book.setDescription("testBuku");
		book.setIsbn("999819");
		book.setPublisher("andi publisher");
		book.setTitle("testing book");
		Book responseBook = restTemplate.postForObject(server_url+"savebook.json", book, Book.class);
		System.out.println("ID "+responseBook.getId()+" book : "+responseBook.getTitle());
	}

}
