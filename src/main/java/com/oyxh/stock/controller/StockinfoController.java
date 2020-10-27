package com.oyxh.stock.controller;





import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oyxh.stock.common.httpclient.ProxyConfig;
import com.oyxh.stock.domain.StockDO;
import com.oyxh.stock.domain.StockinfoDO;
import com.oyxh.stock.service.StockService;
import com.oyxh.stock.service.StockinfoService;




@Controller
public class StockinfoController extends BaseController {
	private  RequestConfig proxyConfig = new ProxyConfig("bc.hn.cmcc",8080).getProxyConfig();
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 @Autowired
	  private StockinfoService stockinfoService;
	 @Autowired
	  private StockService stockService;

	   @GetMapping("/querystockinfos")
	   @ResponseBody
	   public List<StockinfoDO> queryAllStockInfos(){
		  
	    	List<StockinfoDO> stockInfoList = stockinfoService.list();
	    	
	    	 //model.addAttribute("users", userList);
	        
	    	return stockInfoList;
	    }
	   
	   
	   //以下为股票
	   @GetMapping("/querystocks")
	   @ResponseBody
	   public List<StockDO> queryAllStocks(){
		  
	    	List<StockDO> stockList = stockService.list();
	    	
	    	 //model.addAttribute("users", userList);
	       
	    	return stockList;
	    }
	   
	  // private String cronStr = "*/5 * * * * *";

	/*    @RequestMapping("/startCron1")

	    public String startCron1(){

	        System.out.println("startCron1 >>>>");

	        threadPoolTaskScheduler.schedule(new MyRunnable(), new Trigger(){

	            @Override

	            public Date nextExecutionTime(TriggerContext triggerContext){

	                returnnew CronTrigger(cronStr).nextExecutionTime(triggerContext);

	            }

	        });

	        System.out.println("startCron1 <<<<");

	        return "startCron1";

	    }*/
	   
	   @Scheduled(cron="0 0/30 * ? * MON-FRI")
	   public void queryStockFromInternet() {
		   System.out.println("this is from controll");
		   List<StockDO> stockList = this.queryAllStocks();
		   List<StockinfoDO> stockinfoList = queryOneStockFromInternert(stockList);
		   stockinfoService.batchAdd(stockinfoList);
	   }
	   
	   public List<StockinfoDO> queryOneStockFromInternert(List<StockDO> stockList) {
			final CloseableHttpClient httpclient = HttpClients.createDefault();
			List<StockinfoDO> stockinfoList = new ArrayList();
			 for(StockDO stockdo : stockList) {
				 System.out.println(stockdo.getStockId());
				 String url = "http://qt.gtimg.cn/q=";
				 String stockId = stockdo.getStockId();
				   if( stockId.compareTo("600000") >= 0 || stockId.equals("000991")) {
			        	url = url + "sh" + stockId;
			        }else {
			        	url = url + "sz" + stockId;
			        }
				   System.out.println(url);
			        final HttpGet request1 = new HttpGet(url);
			        request1.setConfig(proxyConfig);
			        CloseableHttpResponse response1;
					try {
						response1 = httpclient.execute(request1);
						System.out.println(response1.getCode() + " " + response1.getReasonPhrase());
						if(response1.getCode()==200) {
							String[] stockInfo = EntityUtils.toString(response1.getEntity()).split("~");
							if(stockInfo.length >30) {
								StockinfoDO stockinfodo = new StockinfoDO(stockInfo);
								stockinfoList.add(stockinfodo);
							}
							
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			  }
       
			 return stockinfoList;
	   }
	
}
