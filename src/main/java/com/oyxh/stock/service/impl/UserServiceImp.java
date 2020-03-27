package com.oyxh.stock.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oyxh.stock.dao.UserDao;
import com.oyxh.stock.dao.UserRoleDao;
import com.oyxh.stock.domain.UserDO;
import com.oyxh.stock.domain.UserRoleDO;
import com.oyxh.stock.service.UserService;



@Transactional
@Lazy
@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserDao userMapper;
	@Autowired
	UserRoleDao userRoleMapper;
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Override
	public UserDO get(Long id) {
		List<Long> roleIds = userRoleMapper.listRoleId(id);
		UserDO user = userMapper.get(id);
		
		user.setroleIds(roleIds);
		return user;
	}

	@Override
	public List<UserDO> list() {
		return userMapper.list();
	}
	
	@Override
	@Cacheable(cacheNames = "userlist",key = "#params['username']")
	public List<UserDO> list(Map<String, Object> params) {
		List<UserDO> userlist = userMapper.list(params);
		return userlist;
	}

	@Override
	public int count(Map<String, Object> map) {
		return userMapper.count(map);
	}

    @Transactional
	@Override
	public int save(UserDO user) {
		int count = userMapper.save(user);
		Long userId = user.getUserId();	
		return count;
	}

	@Override
	@CacheEvict(cacheNames="userlist",key="#user.getUsername()")
	public int update(UserDO user) {
		int r = userMapper.update(user);
		System.out.println("更新返回" + r);
		return r;
	}

	@Override
	public int remove(Long userId) {
		userRoleMapper.removeByUserId(userId);
		return userMapper.remove(userId);
	}

	@Override
	public boolean exit(Map<String, Object> params) {
		boolean exit;
		exit = userMapper.list(params).size() > 0;
		return exit;
	}

	@Override
	public Set<String> listRoles(Long userId) {
		return null;
	}

	@Override
	public int resetPwd(UserDO user) {
		int r = userMapper.update(user);
		return r;
	}

	/*@Transactional*/
	@Override
	public int batchremove(Long[] userIds) {
		int count = userMapper.batchRemove(userIds);
		userRoleMapper.batchRemoveByUserId(userIds);
		return count;
	}



}
