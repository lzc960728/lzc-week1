/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: PlantService.java 
 * @Prject: lzc-week1
 * @Package: com.lzc.service 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月6日 上午8:45:59 
 * @version: V1.0   
 */
package com.lzc.service;

import java.util.List;

import com.lzc.domain.Plant;
import com.lzc.domain.Types;

/** 
 * @ClassName: PlantService 
 * @Description: 业务层
 * @author: lenovo
 * @date: 2019年8月6日 上午8:45:59  
 */
public interface PlantService {

	/** 
	 * @Title: selects 
	 * @Description: 全查 模糊 列表 
	 * @param plant
	 * @return
	 * @return: List<Plant>
	 */
	List<Plant> selects(Plant plant);

	/** 
	 * @Title: getTypes 
	 * @Description: 类型回显
	 * @return
	 * @return: List<Types>
	 */
	List<Types> getTypes();

	/** 
	 * @Title: add 
	 * @Description: 添加
	 * @param plant
	 * @return
	 * @return: int
	 */
	int add(Plant plant);

	/** 
	 * @Title: getByid 
	 * @Description: 单查 
	 * @param pid
	 * @return
	 * @return: Plant
	 */
	Plant getByid(int pid);

	/** 
	 * @Title: update 
	 * @Description: 修改
	 * @param plant
	 * @return
	 * @return: int
	 */
	int update(Plant plant);

	/** 
	 * @Title: delALL 
	 * @Description: 批量删除
	 * @param pids
	 * @return
	 * @return: int
	 */
	int delALL(String pids);

}
