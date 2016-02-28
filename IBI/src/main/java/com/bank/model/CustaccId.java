package com.bank.model;

// Generated Feb 27, 2016 9:42:37 PM by Hibernate Tools 4.3.1

/**
 * CustaccId generated by hbm2java
 */
public class CustaccId implements java.io.Serializable {

	private long custid;
	private long accnum;

	public CustaccId() {
	}

	public CustaccId(long custid, long accnum) {
		this.custid = custid;
		this.accnum = accnum;
	}

	public long getCustid() {
		return this.custid;
	}

	public void setCustid(long custid) {
		this.custid = custid;
	}

	public long getAccnum() {
		return this.accnum;
	}

	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CustaccId))
			return false;
		CustaccId castOther = (CustaccId) other;

		return (this.getCustid() == castOther.getCustid())
				&& (this.getAccnum() == castOther.getAccnum());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getCustid();
		result = 37 * result + (int) this.getAccnum();
		return result;
	}

}
