package belajar.spring.pustaka.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="borrowing")
public class BorrowingBook {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idBook", nullable=false)
	private Book idBook;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idMember", nullable=false)
	private Member idMember;
	
	private Date borrowingDate;
	private boolean isReturn;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="idBorrowing")
	private Set<ReversionBook> mborrowing = new HashSet<ReversionBook>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book getIdBook() {
		return idBook;
	}

	public void setIdBook(Book idBook) {
		this.idBook = idBook;
	}

	public Member getIdMember() {
		return idMember;
	}

	public void setIdMember(Member idMember) {
		this.idMember = idMember;
	}

	public Date getBorrowingDate() {
		return borrowingDate;
	}

	public void setBorrowingDate(Date borrowingDate) {
		this.borrowingDate = borrowingDate;
	}

	public boolean isReturn() {
		return isReturn;
	}

	public void setReturn(boolean isReturn) {
		this.isReturn = isReturn;
	}
}
