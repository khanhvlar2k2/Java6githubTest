package com.asm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MailInfo {
	String from;
	String to;
	String[] cc;
	String[] bcc;
	String subject;
	String body;
	String[] attachments;
	public MailInfo(String to, String subject, String body) {
		super();
		this.from = "KMSHOP <poly@fpt.edu.vn>";
		this.to = to;
		this.subject = subject;
		this.body = body;
	}
}

