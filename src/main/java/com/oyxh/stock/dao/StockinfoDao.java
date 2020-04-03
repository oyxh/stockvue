package com.oyxh.stock.dao;



import java.util.List;
import org.apache.ibatis.annotations.Mapper;


import com.oyxh.stock.domain.StockinfoDO;



/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-03 09:45:11
 */
@Mapper
public interface StockinfoDao {

	StockinfoDO get(Long userId);
	List<StockinfoDO> list();
	int batchAdd(List<StockinfoDO> stockinfoDOs);
}
