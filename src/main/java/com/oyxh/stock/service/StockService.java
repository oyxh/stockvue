package com.oyxh.stock.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oyxh.stock.domain.StockDO;
@Service
public interface StockService {
	StockDO get(String id);

	List<StockDO> list();

}
