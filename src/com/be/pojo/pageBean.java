package com.be.pojo;

public class pageBean {
	private Integer page;// 当前ye

	private Integer mpage;// 总页数
	
	private Integer rows;//每页行数

	private Integer mrows;//总行数

	public pageBean(Integer page, Integer mpage, Integer rows, Integer mrows) {
		super();
		this.page = page;
		this.mpage = mpage;
		this.rows = rows;
		this.mrows = mrows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getMpage() {
		return mpage;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getMrows() {
		return mrows;
	}

	public void setMrows(Integer mrows) {
		this.mrows = mrows;
			int r=mrows%rows;
			if(r!=0){
				this.mpage=mrows/rows+1;
			}else{
				this.mpage=mrows/rows;
			}
			
	}

	public pageBean() {
		super();

	}



}
