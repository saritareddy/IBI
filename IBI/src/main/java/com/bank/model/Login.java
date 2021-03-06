package com.bank.model;

// Generated Feb 27, 2016 9:42:37 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Login generated by hbm2java
 */
public class Login implements java.io.Serializable {

	private long loginid;
	private String username;
	private String password;
	private String answer;
	private String usertype;
	private String question;
	private Set loginaccs = new HashSet(0);

	public Login() {
	}

	public Login(long loginid, String username, String password, String answer,
			String question) {
		this.loginid = loginid;
		this.username = username;
		this.password = password;
		this.answer = answer;
		this.question = question;
	}

	public Login(long loginid, String username, String password, String answer,
			String usertype, String question, Set loginaccs) {
		this.loginid = loginid;
		this.username = username;
		this.password = password;
		this.answer = answer;
		this.usertype = usertype;
		this.question = question;
		this.loginaccs = loginaccs;
	}

	public long getLoginid() {
		return this.loginid;
	}

	public void setLoginid(long loginid) {
		this.loginid = loginid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getUsertype() {
		return this.usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Set getLoginaccs() {
		return this.loginaccs;
	}

	public void setLoginaccs(Set loginaccs) {
		this.loginaccs = loginaccs;
	}

}
