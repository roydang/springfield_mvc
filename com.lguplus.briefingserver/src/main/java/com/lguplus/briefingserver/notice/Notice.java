package com.lguplus.briefingserver.notice;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.u2ware.springfield.config.Springfield;


@Entity
public class Notice {

	@Id
	private Integer id;
	private String subject;
	private String body;
	private String updateDate;
	private String updateUser;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
}
