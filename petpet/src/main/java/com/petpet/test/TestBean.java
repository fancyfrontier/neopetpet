package com.petpet.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Test")
public class TestBean {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "MemberID")
	private Integer memberid;
	
	@Column(name = "Email", nullable = false)
	private String email;
	
	@Column(name = "Fullname", nullable = true)
	private String fullname;

	public Integer getMemberid() {
		return memberid;
	}

	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	
}
