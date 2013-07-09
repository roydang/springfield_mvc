package com.lguplus.briefingserver.notice;

import com.u2ware.springfield.config.Springfield;
import com.u2ware.springfield.repository.QueryMethod;

@Springfield(methodLevelMapping={"*","*.json"},entity=Notice.class)
@QueryMethod("findBySubjectAndBodyContaining")
public class NoticeSearch {

	private String subject;
	private String body;

	public String getSubject() {
		return subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
