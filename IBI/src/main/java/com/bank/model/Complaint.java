package com.bank.model;

// Generated Feb 27, 2016 9:42:37 PM by Hibernate Tools 4.3.1

import java.sql.Clob;
import java.util.Date;

/**
 * Complaint generated by hbm2java
 */
public class Complaint implements java.io.Serializable {

	private long compno;
	private String compto;
	private String compfrom;
	private String subject;
	private Clob compmatter;
	private Date compdate;

	public Complaint() {
	}

	public Complaint(long compno, String compto, String compfrom,
			String subject, Clob compmatter, Date compdate) {
		this.compno = compno;
		this.compto = compto;
		this.compfrom = compfrom;
		this.subject = subject;
		this.compmatter = compmatter;
		this.compdate = compdate;
	}

	public long getCompno() {
		return this.compno;
	}

	public void setCompno(long compno) {
		this.compno = compno;
	}

	public String getCompto() {
		return this.compto;
	}

	public void setCompto(String compto) {
		this.compto = compto;
	}

	public String getCompfrom() {
		return this.compfrom;
	}

	public void setCompfrom(String compfrom) {
		this.compfrom = compfrom;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Clob getCompmatter() {
		return this.compmatter;
	}

	public void setCompmatter(Clob compmatter) {
		this.compmatter = compmatter;
	}

	public Date getCompdate() {
		return this.compdate;
	}

	public void setCompdate(Date compdate) {
		this.compdate = compdate;
	}

}
