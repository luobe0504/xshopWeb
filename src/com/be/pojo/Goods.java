package com.be.pojo;

import java.util.Date;

public class Goods {
	private Integer gid;
	private Integer gtid;
	private String gname;
	private Date gdate;
	private String gpug;
	private String pic1;
	private String pic2;
	private String pic3;
	private String pic4;
	
	public String getPic1() {
		return pic1;
	}
	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}
	public String getPic2() {
		return pic2;
	}
	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}
	public String getPic3() {
		return pic3;
	}
	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}
	public String getPic4() {
		return pic4;
	}
	public void setPic4(String pic4) {
		this.pic4 = pic4;
	}
	private String gpicture;
	private Integer gprice;
	private Integer gstar;
	private String gtname;
	public String getGpug() {
		return gpug;
	}
	public void setGpug(String gpug) {
		this.gpug = gpug;
	}
	public String getGtname() {
		return gtname;
	}
	public void setGtname(String gtname) {
		this.gtname = gtname;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gtid=" + gtid + ", gname=" + gname + ", gdate=" + gdate + ", gpic=" + gpicture
				+ ", gprice=" + gprice + ", gstar=" + gstar + ", ginfo=" + ginfo + "]";
	}
	public Goods(Integer gid, Integer gtid, String gname, Date gdate, String gpic, Integer gprice, Integer gstar,
			String ginfo) {
		super();
		this.gid = gid;
		this.gtid = gtid;
		this.gname = gname;
		this.gdate = gdate;
		this.gpicture = gpic;
		this.gprice = gprice;
		this.gstar = gstar;
		this.ginfo = ginfo;
	}
	public Goods() {
		
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public Integer getGtid() {
		return gtid;
	}
	public void setGtid(Integer gtid) {
		this.gtid = gtid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Date getGdate() {
		return gdate;
	}
	public void setGdate(Date gdate) {
		this.gdate = gdate;
	}
	
	public String getGpicture() {
		return gpicture;
	}
	public void setGpicture(String gpicture) {
		this.gpicture = gpicture;
	}
	public Integer getGprice() {
		return gprice;
	}
	public void setGprice(Integer gprice) {
		this.gprice = gprice;
	}
	public Integer getGstar() {
		return gstar;
	}
	public void setGstar(Integer gstar) {
		this.gstar = gstar;
	}
	public String getGinfo() {
		return ginfo;
	}
	public void setGinfo(String ginfo) {
		this.ginfo = ginfo;
	}
	private String ginfo;
}
	

