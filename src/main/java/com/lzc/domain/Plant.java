/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Plant.java 
 * @Prject: lzc-week1
 * @Package: com.lzc.domain 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月6日 上午8:43:07 
 * @version: V1.0   
 */
package com.lzc.domain;

import java.io.Serializable;

/** 
 * @ClassName: Plant 
 * @Description: 植物实体类
 * @author: lenovo
 * @date: 2019年8月6日 上午8:43:07  
 */
public class Plant {

	private Integer pid;//植物序号
	private String pname;//植物名称
	private String pshow;//植物描述
	private Integer tid;//类型序号
	
	private String tname;//类型名称

	@Override
	public String toString() {
		return "Plant [pid=" + pid + ", pname=" + pname + ", pshow=" + pshow + ", tid=" + tid + ", tname=" + tname
				+ "]";
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPshow() {
		return pshow;
	}

	public void setPshow(String pshow) {
		this.pshow = pshow;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}
	
	
}
