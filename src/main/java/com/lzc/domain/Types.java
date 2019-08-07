/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Types.java 
 * @Prject: lzc-week1
 * @Package: com.lzc.domain 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月6日 上午8:44:46 
 * @version: V1.0   
 */
package com.lzc.domain;

/** 
 * @ClassName: Types 
 * @Description: 类型实体类
 * @author: lenovo
 * @date: 2019年8月6日 上午8:44:46  
 */
public class Types {

	private Integer tid;//类型序号
	
	private String tname;//类型名称
	@Override
	public String toString() {
		return "Types [tid=" + tid + ", tname=" + tname + "]";
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
