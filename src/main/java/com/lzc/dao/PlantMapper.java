/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: PlantMapper.java 
 * @Prject: lzc-week1
 * @Package: com.lzc.dao 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年8月6日 上午8:46:38 
 * @version: V1.0   
 */
package com.lzc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lzc.domain.Plant;
import com.lzc.domain.Types;

/** 
 * @ClassName: PlantMapper 
 * @Description: mapper
 * @author: lenovo
 * @date: 2019年8月6日 上午8:46:38  
 */
public interface PlantMapper {

	/** 
	 * @Title: selects 
	 * @Description: 全查 列表 分页 模糊
	 * @param plant
	 * @return
	 * @return: List<Plant>
	 */
	List<Plant> selects(Plant plant);

	/** 
	 * @Title: getTypes 
	 * @Description: 添加类型回显
	 * @return
	 * @return: List<Types>
	 */
	@Select("select * from types")
	List<Types> getTypes();

	/** 
	 * @Title: add 
	 * @Description: 添加
	 * @param plant
	 * @return
	 * @return: int
	 */
	@Insert("insert into plant set pname = #{pname},pshow = #{pshow} ,tid =#{tid}")
	int add(Plant plant);

	/** 
	 * @Title: getByid 
	 * @Description: 单查回显
	 * @param pid
	 * @return
	 * @return: Plant
	 */
	@Select("SELECT * FROM `plant` p LEFT JOIN `types` t ON p.`tid`= t.`tid` where pid = #{pid}")
	Plant getByid(int pid);

	/** 
	 * @Title: update 
	 * @Description: 修改
	 * @param plant
	 * @return
	 * @return: int
	 */
	@Update("update plant set pname = #{pname},pshow = #{pshow} ,tid =#{tid} where pid = #{pid}")
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
