package com.oyxh.stock.service.impl;


import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oyxh.stock.dao.StockinfoDao;
import com.oyxh.stock.domain.StockinfoDO;
import com.oyxh.stock.service.StockinfoService;




@Transactional
@Lazy
@Service
public class StockinfoServiceImp implements StockinfoService {
	@Autowired
	StockinfoDao stockinfoMapper;

	
	@Override
	public StockinfoDO get(Long id) {
		StockinfoDO user = stockinfoMapper.get(id);
		return user;
	}

	@Override
	public List<StockinfoDO> list() {
		return stockinfoMapper.list();
	}

	@Override
	public int batchAdd(List<StockinfoDO> stockinfoDOs) {
		// TODO Auto-generated method stub
		
		int r = stockinfoMapper.batchAdd(stockinfoDOs);
		return r;
	}



}
