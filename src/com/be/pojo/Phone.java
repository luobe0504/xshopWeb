package com.be.pojo;

import java.util.Date;

public class Phone {
	private Integer phid;
	private String phchuliqi;
	private String phneicun;
	private String phyanse;
	private String pnbanben;
	private Integer gid;
	private Integer gtid;
	private String gname;
	private Date gdate;
	private String gpug;
	public Integer getPhid() {
		return phid;
	}
	public void setPhid(Integer phid) {
		this.phid = phid;
	}
	public String getPhchuliqi() {
		return phchuliqi;
	}
	public void setPhchuliqi(String phchuliqi) {
		this.phchuliqi = phchuliqi;
	}
	public String getPhneicun() {
		return phneicun;
	}
	public void setPhneicun(String phneicun) {
		this.phneicun = phneicun;
	}
	public String getPhyanse() {
		return phyanse;
	}
	public void setPhyanse(String phyanse) {
		this.phyanse = phyanse;
	}
	public String getPnbanben() {
		return pnbanben;
	}
	public void setPnbanben(String pnbanben) {
		this.pnbanben = pnbanben;
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
	public String getGpug() {
		return gpug;
	}
	public void setGpug(String gpug) {
		this.gpug = gpug;
	}
	public String getGpic1() {
		return gpic1;
	}
	public void setGpic1(String gpic1) {
		this.gpic1 = gpic1;
	}
	public String getGpic2() {
		return gpic2;
	}
	public void setGpic2(String gpic2) {
		this.gpic2 = gpic2;
	}
	public String getGpic3() {
		return gpic3;
	}
	public void setGpic3(String gpic3) {
		this.gpic3 = gpic3;
	}
	public String getGpic4() {
		return gpic4;
	}
	public void setGpic4(String gpic4) {
		this.gpic4 = gpic4;
	}
	public String getGprice() {
		return gprice;
	}
	public void setGprice(String gprice) {
		this.gprice = gprice;
	}
	public String getGpicture() {
		return gpicture;
	}
	public void setGpicture(String gpicture) {
		this.gpicture = gpicture;
	}
	public String getGstar() {
		return gstar;
	}
	public void setGstar(String gstar) {
		this.gstar = gstar;
	}
	public String getGinfo() {
		return ginfo;
	}
	public void setGinfo(String ginfo) {
		this.ginfo = ginfo;
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
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phone(Integer phid, String phchuliqi, String phneicun, String phyanse, String pnbanben, Integer gid,
			Integer gtid, String gname, Date gdate, String gpic1, String gpic2, String gpic3, String gpic4,
			String gprice, String gpicture, String gstar, String ginfo, String gtname, Integer gtlevel,
			Integer gtparent) {
		super();
		this.phid = phid;
		this.phchuliqi = phchuliqi;
		this.phneicun = phneicun;
		this.phyanse = phyanse;
		this.pnbanben = pnbanben;
		this.gid = gid;
		this.gtid = gtid;
		this.gname = gname;
		this.gdate = gdate;
		this.gpic1 = gpic1;
		this.gpic2 = gpic2;
		this.gpic3 = gpic3;
		this.gpic4 = gpic4;
		this.gprice = gprice;
		this.gpicture = gpicture;
		this.gstar = gstar;
		this.ginfo = ginfo;
		this.gtname = gtname;
		this.gtlevel = gtlevel;
		this.gtparent = gtparent;
	}

	private String gpic1;
	private String gpic2;
	private String gpic3;
	private String gpic4;
	private String gprice;
	private String gpicture;
	private String gstar;
	private String ginfo;
	private String gtname;
	private Integer gtlevel;
	private Integer gtparent;
}
