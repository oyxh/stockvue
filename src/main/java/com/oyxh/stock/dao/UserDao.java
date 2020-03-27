package com.oyxh.stock.dao;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.oyxh.stock.domain.UserDO;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-03 09:45:11
 */
@Mapper
public interface UserDao {

	UserDO get(Long userId);
	List<UserDO> list();
	List<UserDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(UserDO user);
	
	int update(UserDO user);
	
	int remove(Long user_id);
	
	int batchRemove(Long[] userIds);
	
	Long[] listAllDept();
}
