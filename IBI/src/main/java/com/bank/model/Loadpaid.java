package com.bank.model;

// Generated Feb 27, 2016 9:42:37 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Loadpaid generated by hbm2java
 */
public class Loadpaid implements java.io.Serializable {

	private long paymentid;
	private long loanid;
	private double instdueamt;
	private Date instduedate;
	private Date paiddate;
	private double paidamt;
	private String noinstpaid;

	public Loadpaid() {
	}

	public Loadpaid(long paymentid, long loanid, double instdueamt,
			Date instduedate, Date paiddate, double paidamt, String noinstpaid) {
		this.paymentid = paymentid;
		this.loanid = loanid;
		this.instdueamt = instdueamt;
		this.instduedate = instduedate;
		this.paiddate = paiddate;
		this.paidamt = paidamt;
		this.noinstpaid = noinstpaid;
	}

	public long getPaymentid() {
		return this.paymentid;
	}

	public void setPaymentid(long paymentid) {
		this.paymentid = paymentid;
	}

	public long getLoanid() {
		return this.loanid;
	}

	public void setLoanid(long loanid) {
		this.loanid = loanid;
	}

	public double getInstdueamt() {
		return this.instdueamt;
	}

	public void setInstdueamt(double instdueamt) {
		this.instdueamt = instdueamt;
	}

	public Date getInstduedate() {
		return this.instduedate;
	}

	public void setInstduedate(Date instduedate) {
		this.instduedate = instduedate;
	}

	public Date getPaiddate() {
		return this.paiddate;
	}

	public void setPaiddate(Date paiddate) {
		this.paiddate = paiddate;
	}

	public double getPaidamt() {
		return this.paidamt;
	}

	public void setPaidamt(double paidamt) {
		this.paidamt = paidamt;
	}

	public String getNoinstpaid() {
		return this.noinstpaid;
	}

	public void setNoinstpaid(String noinstpaid) {
		this.noinstpaid = noinstpaid;
	}

}