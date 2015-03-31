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
@Table(name = "member")
public class Member {
	
	private int id;
	private String serialIdNumber;
	private String fullName;
	private String email;
	private String Address;
	private String contact;
	private String imgPhoto;
	private boolean isDelete;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="idMember")
	private Set<ReversionBook> mreversionBook = new HashSet<ReversionBook>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isDelete() {
		return isDelete;
	}
	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
	
	public String getSerialIdNumber() {
		return serialIdNumber;
	}
	public void setSerialIdNumber(String serialIdNumber) {
		this.serialIdNumber = serialIdNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String getImgPhoto() {
		return imgPhoto;
	}
	public void setImgPhoto(String imgPhoto) {
		this.imgPhoto = imgPhoto;
	}
	
	
	
}
