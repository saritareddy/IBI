package com.bank.model;

// Generated Feb 27, 2016 9:42:37 PM by Hibernate Tools 4.3.1

import java.sql.Clob;
import java.util.Date;

/**
 * Loanrejected generated by hbm2java
 */
public class Loanrejected implements java.io.Serializable {

	private long loanrejid;
	private Date loanrejdate;
	private long loanrejby;
	private Clob rejreason;
	private long loanid;

	public Loanrejected() {
	}

	public Loanrejected(long loanrejid, Date loanrejdate, long loanrejby,
			Clob rejreason, long loanid) {
		this.loanrejid = loanrejid;
		this.loanrejdate = loanrejdate;
		this.loanrejby = loanrejby;
		this.rejreason = rejreason;
		this.loanid = loanid;
	}

	public long getLoanrejid() {
		return this.loanrejid;
	}

	public void setLoanrejid(long loanrejid) {
		this.loanrejid = loanrejid;
	}

	public Date getLoanrejdate() {
		return this.loanrejdate;
	}

	public void setLoanrejdate(Date loanrejdate) {
		this.loanrejdate = loanrejdate;
	}

	public long getLoanrejby() {
		return this.loanrejby;
	}

	public void setLoanrejby(long loanrejby) {
		this.loanrejby = loanrejby;
	}

	public Clob getRejreason() {
		return this.rejreason;
	}

	public void setRejreason(Clob rejreason) {
		this.rejreason = rejreason;
	}

	public long getLoanid() {
		return this.loanid;
	}

	public void setLoanid(long loanid) {
		this.loanid = loanid;
	}

}
