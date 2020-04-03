package com.oyxh.stock.common.httpclient;

import java.util.concurrent.TimeUnit;


import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.core5.http.HttpHost;

public class ProxyConfig {
	private  RequestConfig requestConfig;
	public ProxyConfig(String proxyHost,int proxyPort){
		HttpHost proxy = new HttpHost(proxyHost, proxyPort);
		this.requestConfig = RequestConfig.custom()
	            .setProxy(proxy)
	            .setConnectTimeout(10000,TimeUnit.MILLISECONDS)
	            .setConnectionRequestTimeout(10000, TimeUnit.MILLISECONDS)
	            .build();
	}
	
	/**
	 * 设置代理服务器
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public  void setRequestConfig(String proxyHost,int proxyPort) {
	    HttpHost proxy = new HttpHost(proxyHost, proxyPort);
	    this.requestConfig = RequestConfig.custom()
	            .setProxy(proxy)
	            .setConnectTimeout(10000,TimeUnit.MILLISECONDS)
	            .setConnectionRequestTimeout(10000, TimeUnit.MILLISECONDS)
	            .build();
	    
	}
	public RequestConfig getProxyConfig() {
		return this.requestConfig;
	}
}
