package com.oyxh.stock.controller;





import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.oyxh.stock.domain.StockinfoDO;
import com.oyxh.stock.service.StockinfoService;




@Controller
public class StockinfoController extends BaseController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 @Autowired
	  private StockinfoService stockinfoService;

	   @GetMapping("/querystocks")
	   @ResponseBody
	   public List<StockinfoDO> queryAllUsers(){
		  
	    	List<StockinfoDO> userList = stockinfoService.list();
	    	
	    	 //model.addAttribute("users", userList);
	        
	    	return userList;
	    }
	
}
