package com.bank.model;

// Generated Feb 27, 2016 9:42:37 PM by Hibernate Tools 4.3.1

/**
 * Loginacc generated by hbm2java
 */
public class Loginacc implements java.io.Serializable {

	private LoginaccId id;
	private Login login;
	private Account account;

	public Loginacc() {
	}

	public Loginacc(LoginaccId id, Login login, Account account) {
		this.id = id;
		this.login = login;
		this.account = account;
	}

	public LoginaccId getId() {
		return this.id;
	}

	public void setId(LoginaccId id) {
		this.id = id;
	}

	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}