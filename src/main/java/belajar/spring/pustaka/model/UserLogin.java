package belajar.spring.pustaka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "userlogin")
public class UserLogin {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="fullname")
	private String fullname;
	
	@Column(name = "username", unique = true, length = 45)
	private String username;

	@Column(name = "password", length = 60)
	private String password;

	@Column(name = "enabled")
	private boolean enabled;

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	private Set<UserRole> userRole = new HashSet<UserRole>(0);
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userroleid")
	private UserRole userRoleId;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public UserRole getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(UserRole userRoleId) {
		this.userRoleId = userRoleId;
	}

//	public Set<UserRole> getUserRole() {
//		return userRole;
//	}
//
//	public void setUserRole(Set<UserRole> userRole) {
//		this.userRole = userRole;
//	}
}
