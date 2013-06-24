package cn.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@javax.persistence.SequenceGenerator(name = "seq_user", sequenceName = "seq_user", initialValue = 10001, allocationSize = 1)
@Table(name = "tb_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")
	private int id;

	@Column(name = "username", length = 15)
	private String username;

	@Column(name = "password", length = 15)
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}