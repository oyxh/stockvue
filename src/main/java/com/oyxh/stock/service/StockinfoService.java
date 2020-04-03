package com.oyxh.stock.service;

import java.util.List;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.oyxh.stock.domain.StockinfoDO;




@Service
public interface StockinfoService {
	StockinfoDO get(Long id);

	List<StockinfoDO> list();
	int batchAdd(List<StockinfoDO> stockinfoDOs);

}
