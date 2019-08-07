/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: PlantCon.java 
 * @Prject: lzc-week1
 * @Package: com.lzc.controller 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月6日 上午8:45:24 
 * @version: V1.0   
 */
package com.lzc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzc.domain.Plant;
import com.lzc.domain.Types;
import com.lzc.service.PlantService;

/** 
 * @ClassName: PlantCon 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月6日 上午8:45:24  
 */
@Controller
public class PlantCon {

	@Autowired
	PlantService s;
	/**
	 * 
	 * @Title: look 
	 * @Description: 查看页面
	 * @param pid
	 * @return
	 * @return: String
	 */
	@RequestMapping("look")
	public String look(int pid,HttpServletRequest request) {
		Plant pl = s.getByid(pid);
		request.setAttribute("pl", pl);
		return "look";
	}
	/**
	 * 
	 * @Title: delALL 
	 * @Description: 批量删除
	 * @param pids
	 * @return
	 * @return: int
	 */
	@RequestMapping("delALL")
	@ResponseBody
	public int delALL(String pids) {
		int i =s.delALL(pids);
		return i;
	}
	/**
	 * 
	 * @Title: toupdate 
	 * @Description: 去修改
	 * @param request
	 * @param pid
	 * @return
	 * @return: String
	 */
	@RequestMapping("toupdate")
	public String toupdate(HttpServletRequest request ,int pid) {
		List<Types> types = s.getTypes();
		Plant pl = s.getByid(pid);
		request.setAttribute("types", types);
		request.setAttribute("pl", pl);
		
		return "update";
	}
	/**
	 * 
	 * @Title: update 
	 * @Description:修改
	 * @param plant
	 * @return
	 * @return: int
	 */
	@RequestMapping("update")
	@ResponseBody
	public int update(Plant plant) {
		int i =s.update( plant);
		return i;
	}
	/**
	 * 
	 * @Title: toadd 
	 * @Description:去添加
	 * @param request
	 * @return
	 * @return: String
	 */
	@RequestMapping("toadd")
	public String toadd(HttpServletRequest request) {
		List<Types> types = s.getTypes();
		request.setAttribute("types", types);
		return "add";
	}
	
	/**
	 * 
	 * @Title: add 
	 * @Description:添加 
	 * @param plant
	 * @return
	 * @return: int
	 */
	@RequestMapping("add")
	@ResponseBody
	public int add(Plant plant) {
		int i =s.add( plant);
		return i;
	}
	
	/**
	 * 
	 * @Title: selects 
	 * @Description:列表展示  分页  模糊查询
	 * @param request
	 * @param plant
	 * @param pageNum
	 * @return
	 * @return: String
	 */
	@RequestMapping("list")
	public String selects(HttpServletRequest request,Plant plant,@RequestParam(defaultValue = "1")int pageNum) {
		PageHelper.startPage(pageNum, 2);
		List<Plant> list = s.selects(plant);
		PageInfo<Plant> pg = new PageInfo<Plant>(list);
		request.setAttribute("pg", pg);
		request.setAttribute("plant", plant);
		return "list";
	}
	
}
