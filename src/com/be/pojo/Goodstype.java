package com.be.pojo;

public class Goodstype {
	private Integer gtid;
	private String gtname;
	private Integer gtlevel;
	private Integer gtparent;
	public Goodstype() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goodstype(Integer gtid, String gtname, Integer gtlevel, Integer gtparent) {
		super();
		this.gtid = gtid;
		this.gtname = gtname;
		this.gtlevel = gtlevel;
		this.gtparent = gtparent;
	}
	public Integer getGtid() {
		return gtid;
	}
	public void setGtid(Integer gtid) {
		this.gtid = gtid;
	}
	public String getGtname() {
		return gtname;
	}
	public void setGtname(String gtname) {
		this.gtname = gtname;
	}
	public Integer getGtlevel() {
		return gtlevel;
	}
	public void setGtlevel(Integer gtlevel) {
		this.gtlevel = gtlevel;
	}
	public Integer getGtparent() {
		return gtparent;
	}
	public void setGtparent(Integer gtparent) {
		this.gtparent = gtparent;
	}

}
