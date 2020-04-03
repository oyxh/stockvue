package com.oyxh.stock.dao;





import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.oyxh.stock.domain.StockDO;





@Mapper
public interface StockDao {
	StockDO get(String id);
	List<StockDO> list();
}
