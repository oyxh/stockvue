package com.oyxh.stock;


import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.oyxh.stock.common.httpclient.ProxyConfig;


@EnableTransactionManagement
@EnableCaching
@ServletComponentScan
@MapperScan("com.oyxh.stock.dao")
@SpringBootApplication()
@EnableScheduling
public class StockApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockApplication.class, args);
		System.out.println(
				" ______                    _   ______  \n" + "|_   _ \\                  / |_|_   _ `.          \n"
						+ "  | |_) |   .--.    .--. `| |-' | | `. \\  .--.   \n"
						+ "  |  __'. / .'`\\ \\/ .'`\\ \\| |   | |  | |/ .'`\\ \\\n"
						+ " _| |__) || \\__. || \\__. || |, _| |_.' /| \\__. | \n"
						+ "|_______/  '.__.'  '.__.' \\__/|______.'  '.__.'  ");
		
		RequestConfig proxyConfig = new ProxyConfig("bc.hn.cmcc",8080).getProxyConfig();
		final CloseableHttpClient httpclient = HttpClients.createDefault();
		// final HttpHost target = new HttpHost("www.qt.gtimg.cn/q=sh601318", 80);
		
       // final HttpHost proxy = new HttpHost("http", "127.0.0.1", 8080);
        String url = "http://qt.gtimg.cn/q=sh601318";
        final HttpGet request1 = new HttpGet(url);
        request1.setConfig(proxyConfig);
        CloseableHttpResponse response1;
		try {
			response1 = httpclient.execute(request1);
			System.out.println(response1.getCode() + " " + response1.getReasonPhrase());
			System.out.println(EntityUtils.toString(response1.getEntity()));
			System.out.println("ok");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                 
	}
	
	
	
	
	
}
