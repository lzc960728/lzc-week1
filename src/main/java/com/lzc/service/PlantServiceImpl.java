/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: PlantServiceImpl.java 
 * @Prject: lzc-week1
 * @Package: com.lzc.service 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月6日 上午8:46:09 
 * @version: V1.0   
 */
package com.lzc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzc.dao.PlantMapper;
import com.lzc.domain.Plant;
import com.lzc.domain.Types;

/** 
 * @ClassName: PlantServiceImpl 
 * @Description: TODO
 * @author: lenovo
 * @date: 2019年8月6日 上午8:46:09  
 */
@Service
public class PlantServiceImpl implements PlantService {

	@Autowired
	PlantMapper m;

	/* (non Javadoc) 
	 * @Title: selects
	 * @Description: 列表展示  模糊分页
	 * @param plant
	 * @return 
	 * @see com.lzc.service.PlantService#selects(com.lzc.domain.Plant) 
	 */
	@Override
	public List<Plant> selects(Plant plant) {
		// TODO Auto-generated method stub
		return m.selects(plant);
	}

	/* (non Javadoc) 
	 * @Title: getTypes
	 * @Description: 类型回显
	 * @return 
	 * @see com.lzc.service.PlantService#getTypes() 
	 */
	@Override
	public List<Types> getTypes() {
		// TODO Auto-generated method stub
		return m.getTypes();
	}

	/* (non Javadoc) 
	 * @Title: add
	 * @Description: 添加
	 * @param plant
	 * @return 
	 * @see com.lzc.service.PlantService#add(com.lzc.domain.Plant) 
	 */
	@Override
	public int add(Plant plant) {
		// TODO Auto-generated method stub
		return m.add(plant);
	}

	/* (non Javadoc) 
	 * @Title: getByid
	 * @Description:单查
	 * @param pid
	 * @return 
	 * @see com.lzc.service.PlantService#getByid(int) 
	 */
	@Override
	public Plant getByid(int pid) {
		// TODO Auto-generated method stub
		return m.getByid(pid);
	}

	/* (non Javadoc) 
	 * @Title: update
	 * @Description: TODO
	 * @param plant
	 * @return 
	 * @see com.lzc.service.PlantService#update(com.lzc.domain.Plant) 
	 */
	@Override
	public int update(Plant plant) {
		// TODO Auto-generated method stub
		return m.update(plant);
	}

	/* (non Javadoc) 
	 * @Title: delALL
	 * @Description: 批量删除
	 * @param pids
	 * @return 
	 * @see com.lzc.service.PlantService#delALL(java.lang.String) 
	 */
	@Override
	public int delALL(String pids) {
		// TODO Auto-generated method stub
		return m.delALL( pids);
	}
}
