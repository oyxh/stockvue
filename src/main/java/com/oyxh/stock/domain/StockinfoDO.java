package com.oyxh.stock.domain;

import java.math.BigDecimal;
import java.math.BigInteger;

public class StockinfoDO {
	private BigInteger 	id;
	private String marketCity;
	private String stockName;
	private String stockId;
	private BigDecimal presentPrice;
	private BigDecimal yesterdayPrice;
	private BigDecimal todayPrice;
	private BigDecimal turnoverVolume;
	private BigDecimal outside;
	private BigDecimal inside;
	private BigDecimal priceBuyOne;
	private BigDecimal volumeBuyOne;
	private BigDecimal priceBuyTwo;
	private BigDecimal volumeBuyTwo;
	private BigDecimal priceBuyThree;
	private BigDecimal volumeBuyThree;
	private BigDecimal priceBuyFour;
	private BigDecimal volumeBuyFour;
	private BigDecimal priceBuyFive;
	private BigDecimal volumeBuyFive;
	private BigDecimal priceSellOne;
	private BigDecimal volumeSellOne;
	private BigDecimal priceSellTwo;
	private BigDecimal volumeSellTwo;
	private BigDecimal priceSellThree;
	private BigDecimal volumeSellThree;
	private BigDecimal priceSellFour;
	private BigDecimal volumeSellFour;
	private BigDecimal priceSellFive;
	private BigDecimal volumeSellFive;
	private BigInteger statisDate;
	private BigDecimal rise;
	private BigDecimal riseRate;
	private BigDecimal highestPrice;
	private BigDecimal lowestPrice;
	private BigDecimal turnover;
	private BigDecimal turnoverMoney;
	private BigDecimal turnoverRate;
	private BigDecimal PERate;
	private BigDecimal amplitude;
	private BigDecimal circulationMarket;
	private BigDecimal totalMarket;
	private BigDecimal PBRate;
	private BigDecimal limitUp;
	private BigDecimal limitDown;
	public StockinfoDO(String[] stockInfo) {  //构造函数的序列来自第三方网站的顺序
		// TODO Auto-generated constructor stub
		this.marketCity = stockInfo[0].substring(2, 4);
		this.stockId = stockInfo[2];
		this.stockName = stockInfo[1];
		this.presentPrice=new BigDecimal(stockInfo[3]);
		this.yesterdayPrice=new BigDecimal(stockInfo[4]);
		this.todayPrice=new BigDecimal(stockInfo[5]);
		this.turnoverVolume=new BigDecimal(stockInfo[6]);
		this.outside=new BigDecimal(stockInfo[7]);
		this.inside=new BigDecimal(stockInfo[8]);
		this.priceBuyOne=new BigDecimal(stockInfo[9]);
		this.volumeBuyOne=new BigDecimal(stockInfo[10]);
		this.priceBuyTwo=new BigDecimal(stockInfo[11]);
		this.volumeBuyTwo=new BigDecimal(stockInfo[12]);
		this.priceBuyThree=new BigDecimal(stockInfo[13]);
		this.volumeBuyThree=new BigDecimal(stockInfo[14]);
		this.priceBuyFour=new BigDecimal(stockInfo[15]);
		this.volumeBuyFour=new BigDecimal(stockInfo[16]);
		this.priceBuyFive=new BigDecimal(stockInfo[17]);
		this.volumeBuyFive=new BigDecimal(stockInfo[18]);
		this.priceSellOne=new BigDecimal(stockInfo[19]);
		this.volumeSellOne=new BigDecimal(stockInfo[20]);
		this.priceSellTwo=new BigDecimal(stockInfo[21]);
		this.volumeSellTwo=new BigDecimal(stockInfo[22]);
		this.priceSellThree=new BigDecimal(stockInfo[23]);
		this.volumeSellThree=new BigDecimal(stockInfo[24]);
		this.priceSellFour=new BigDecimal(stockInfo[25]);
		this.volumeSellFour=new BigDecimal(stockInfo[26]);
		this.priceSellFive=new BigDecimal(stockInfo[27]);
		this.volumeSellFive=new BigDecimal(stockInfo[28]);
		this.statisDate=new BigInteger(stockInfo[30]);
		this.rise=new BigDecimal(stockInfo[31]);
		this.riseRate=new BigDecimal(stockInfo[32]);
		this.highestPrice=new BigDecimal(stockInfo[33]);
		this.lowestPrice=new BigDecimal(stockInfo[34]);
		this.turnover=new BigDecimal(stockInfo[36]);
		this.turnoverMoney=new BigDecimal(stockInfo[37]);
		this.turnoverRate=new BigDecimal(stockInfo[38]);
		this.PERate=new BigDecimal(stockInfo[39]);
		this.amplitude=new BigDecimal(stockInfo[43]);
		this.circulationMarket=new BigDecimal(stockInfo[44]);
		this.totalMarket=new BigDecimal(stockInfo[45]);
		this.PBRate=new BigDecimal(stockInfo[46]);
		this.limitUp=new BigDecimal(stockInfo[47]);
		this.limitDown=new BigDecimal(stockInfo[48]);

	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getMarketCity() {
		return marketCity;
	}
	public void setMarketCity(String marketCity) {
		this.marketCity = marketCity;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public BigDecimal getPresentPrice() {
		return presentPrice;
	}
	public void setPresentPrice(BigDecimal presentPrice) {
		this.presentPrice = presentPrice;
	}
	public BigDecimal getYesterdayPrice() {
		return yesterdayPrice;
	}
	public void setYesterdayPrice(BigDecimal yesterdayPrice) {
		this.yesterdayPrice = yesterdayPrice;
	}
	public BigDecimal getTodayPrice() {
		return todayPrice;
	}
	public void setTodayPrice(BigDecimal todayPrice) {
		this.todayPrice = todayPrice;
	}
	public BigDecimal getTurnoverVolume() {
		return turnoverVolume;
	}
	public void setTurnoverVolume(BigDecimal turnoverVolume) {
		this.turnoverVolume = turnoverVolume;
	}
	public BigDecimal getOutside() {
		return outside;
	}
	public void setOutside(BigDecimal outside) {
		this.outside = outside;
	}
	public BigDecimal getInside() {
		return inside;
	}
	public void setInside(BigDecimal inside) {
		this.inside = inside;
	}
	public BigDecimal getPriceBuyOne() {
		return priceBuyOne;
	}
	public void setPriceBuyOne(BigDecimal priceBuyOne) {
		this.priceBuyOne = priceBuyOne;
	}
	public BigDecimal getVolumeBuyOne() {
		return volumeBuyOne;
	}
	public void setVolumeBuyOne(BigDecimal volumeBuyOne) {
		this.volumeBuyOne = volumeBuyOne;
	}
	public BigDecimal getPriceBuyTwo() {
		return priceBuyTwo;
	}
	public void setPriceBuyTwo(BigDecimal priceBuyTwo) {
		this.priceBuyTwo = priceBuyTwo;
	}
	public BigDecimal getVolumeBuyTwo() {
		return volumeBuyTwo;
	}
	public void setVolumeBuyTwo(BigDecimal volumeBuyTwo) {
		this.volumeBuyTwo = volumeBuyTwo;
	}
	public BigDecimal getPriceBuyThree() {
		return priceBuyThree;
	}
	public void setPriceBuyThree(BigDecimal priceBuyThree) {
		this.priceBuyThree = priceBuyThree;
	}
	public BigDecimal getVolumeBuyThree() {
		return volumeBuyThree;
	}
	public void setVolumeBuyThree(BigDecimal volumeBuyThree) {
		this.volumeBuyThree = volumeBuyThree;
	}
	public BigDecimal getPriceBuyFour() {
		return priceBuyFour;
	}
	public void setPriceBuyFour(BigDecimal priceBuyFour) {
		this.priceBuyFour = priceBuyFour;
	}
	public BigDecimal getVolumeBuyFour() {
		return volumeBuyFour;
	}
	public void setVolumeBuyFour(BigDecimal volumeBuyFour) {
		this.volumeBuyFour = volumeBuyFour;
	}
	public BigDecimal getPriceBuyFive() {
		return priceBuyFive;
	}
	public void setPriceBuyFive(BigDecimal priceBuyFive) {
		this.priceBuyFive = priceBuyFive;
	}
	public BigDecimal getVolumeBuyFive() {
		return volumeBuyFive;
	}
	public void setVolumeBuyFive(BigDecimal volumeBuyFive) {
		this.volumeBuyFive = volumeBuyFive;
	}
	public BigDecimal getPriceSellOne() {
		return priceSellOne;
	}
	public void setPriceSellOne(BigDecimal priceSellOne) {
		this.priceSellOne = priceSellOne;
	}
	public BigDecimal getVolumeSellOne() {
		return volumeSellOne;
	}
	public void setVolumeSellOne(BigDecimal volumeSellOne) {
		this.volumeSellOne = volumeSellOne;
	}
	public BigDecimal getPriceSellTwo() {
		return priceSellTwo;
	}
	public void setPriceSellTwo(BigDecimal priceSellTwo) {
		this.priceSellTwo = priceSellTwo;
	}
	public BigDecimal getVolumeSellTwo() {
		return volumeSellTwo;
	}
	public void setVolumeSellTwo(BigDecimal volumeSellTwo) {
		this.volumeSellTwo = volumeSellTwo;
	}
	public BigDecimal getPriceSellThree() {
		return priceSellThree;
	}
	public void setPriceSellThree(BigDecimal priceSellThree) {
		this.priceSellThree = priceSellThree;
	}
	public BigDecimal getVolumeSellThree() {
		return volumeSellThree;
	}
	public void setVolumeSellThree(BigDecimal volumeSellThree) {
		this.volumeSellThree = volumeSellThree;
	}
	public BigDecimal getPriceSellFour() {
		return priceSellFour;
	}
	public void setPriceSellFour(BigDecimal priceSellFour) {
		this.priceSellFour = priceSellFour;
	}
	public BigDecimal getVolumeSellFour() {
		return volumeSellFour;
	}
	public void setVolumeSellFour(BigDecimal volumeSellFour) {
		this.volumeSellFour = volumeSellFour;
	}
	public BigDecimal getPriceSellFive() {
		return priceSellFive;
	}
	public void setPriceSellFive(BigDecimal priceSellFive) {
		this.priceSellFive = priceSellFive;
	}
	public BigDecimal getVolumeSellFive() {
		return volumeSellFive;
	}
	public void setVolumeSellFive(BigDecimal volumeSellFive) {
		this.volumeSellFive = volumeSellFive;
	}
	public BigInteger getStatisDate() {
		return statisDate;
	}
	public void setStatisDate(BigInteger statisDate) {
		this.statisDate = statisDate;
	}
	public BigDecimal getRise() {
		return rise;
	}
	public void setRise(BigDecimal rise) {
		this.rise = rise;
	}
	public BigDecimal getRiseRate() {
		return riseRate;
	}
	public void setRiseRate(BigDecimal riseRate) {
		this.riseRate = riseRate;
	}
	public BigDecimal getHighestPrice() {
		return highestPrice;
	}
	public void setHighestPrice(BigDecimal highestPrice) {
		this.highestPrice = highestPrice;
	}
	public BigDecimal getLowestPrice() {
		return lowestPrice;
	}
	public void setLowestPrice(BigDecimal lowestPrice) {
		this.lowestPrice = lowestPrice;
	}
	public BigDecimal getTurnover() {
		return turnover;
	}
	public void setTurnover(BigDecimal turnover) {
		this.turnover = turnover;
	}
	public BigDecimal getTurnoverMoney() {
		return turnoverMoney;
	}
	public void setTurnoverMoney(BigDecimal turnoverMoney) {
		this.turnoverMoney = turnoverMoney;
	}
	public BigDecimal getTurnoverRate() {
		return turnoverRate;
	}
	public void setTurnoverRate(BigDecimal turnoverRate) {
		this.turnoverRate = turnoverRate;
	}
	public BigDecimal getPERate() {
		return PERate;
	}
	public void setPERate(BigDecimal pERate) {
		PERate = pERate;
	}
	public BigDecimal getAmplitude() {
		return amplitude;
	}
	public void setAmplitude(BigDecimal amplitude) {
		this.amplitude = amplitude;
	}
	public BigDecimal getCirculationMarket() {
		return circulationMarket;
	}
	public void setCirculationMarket(BigDecimal circulationMarket) {
		this.circulationMarket = circulationMarket;
	}
	public BigDecimal getTotalMarket() {
		return totalMarket;
	}
	public void setTotalMarket(BigDecimal totalMarket) {
		this.totalMarket = totalMarket;
	}
	public BigDecimal getPBRate() {
		return PBRate;
	}
	public void setPBRate(BigDecimal pBRate) {
		PBRate = pBRate;
	}
	public BigDecimal getLimitUp() {
		return limitUp;
	}
	public void setLimitUp(BigDecimal limitUp) {
		this.limitUp = limitUp;
	}
	public BigDecimal getLimitDown() {
		return limitDown;
	}
	public void setLimitDown(BigDecimal limitDown) {
		this.limitDown = limitDown;
	}
	
}
