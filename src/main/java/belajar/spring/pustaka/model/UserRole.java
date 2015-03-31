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
@Table(name = "userrole")
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "username_id", nullable = false)
//	private UserLogin user;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="userRoleId")
	private Set<UserLogin> mUserLogin = new HashSet<UserLogin>();

	@Column(name = "role", nullable = false, length = 45)
	private String role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public UserLogin getUser() {
//		return user;
//	}
//
//	public void setUser(UserLogin user) {
//		this.user = user;
//	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<UserLogin> getmUserLogin() {
		return mUserLogin;
	}

	public void setmUserLogin(Set<UserLogin> mUserLogin) {
		this.mUserLogin = mUserLogin;
	}

}
