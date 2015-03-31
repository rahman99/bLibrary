package belajar.spring.pustaka.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "book")
public class Book {

	private int id;
	private String isbn;
	private String title;
	private String publisher;
	private String description;
	private String imgcover;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "idBook")
	private Set<ReversionBook> breversionBook = new HashSet<ReversionBook>();

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgcover() {
		return imgcover;
	}
	public void setImgcover(String imgcover) {
		this.imgcover = imgcover;
	}
	
}
