package com.oyxh.stock.service.impl;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oyxh.stock.dao.StockDao;
import com.oyxh.stock.domain.StockDO;
import com.oyxh.stock.service.StockService;






@Transactional
@Lazy
@Service
public class StockServiceImp implements StockService {
	@Autowired
	StockDao stockMapper;

	
	@Override
	public StockDO get(String id) {
		StockDO user = stockMapper.get(id);
		return user;
	}

	@Override
	public List<StockDO> list() {
		return stockMapper.list();
	}



}
