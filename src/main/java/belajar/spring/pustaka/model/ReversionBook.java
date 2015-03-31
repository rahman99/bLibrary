package belajar.spring.pustaka.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reversion")
public class ReversionBook {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idBook", nullable=false)
	private Book idBook;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idMember", nullable=false)
	private Member idMember;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idBorrwing", nullable = false)
	private BorrowingBook idBorrowing;
	
	private Date reservisionDate;
	
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
	public Date getReservisionDate() {
		return reservisionDate;
	}
	public void setReservisionDate(Date reservisionDate) {
		this.reservisionDate = reservisionDate;
	}
	
	
}
