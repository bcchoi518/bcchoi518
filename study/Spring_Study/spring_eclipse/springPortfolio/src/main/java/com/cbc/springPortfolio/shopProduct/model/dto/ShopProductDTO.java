package com.cbc.springPortfolio.shopProduct.model.dto;

import java.sql.Date;

public class ShopProductDTO {
    private int productCode;
    private String productName;
    private int productPrice;
    private String productDescription;
    private int vendorCode;
    private String attachInfo;
    private Date regiDate;
    
    private String searchGubun;
    private String searchData;
    
    private int pageNumber;
    private int startRecord;
    private int lastRecord;
    
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(int vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getAttachInfo() {
		return attachInfo;
	}
	public void setAttachInfo(String attachInfo) {
		this.attachInfo = attachInfo;
	}
	public Date getRegiDate() {
		return regiDate;
	}
	public void setRegiDate(Date regiDate) {
		this.regiDate = regiDate;
	}
	public String getSearchGubun() {
		return searchGubun;
	}
	public void setSearchGubun(String searchGubun) {
		this.searchGubun = searchGubun;
	}
	public String getSearchData() {
		return searchData;
	}
	public void setSearchData(String searchData) {
		this.searchData = searchData;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getStartRecord() {
		return startRecord;
	}
	public void setStartRecord(int startRecord) {
		this.startRecord = startRecord;
	}
	public int getLastRecord() {
		return lastRecord;
	}
	public void setLastRecord(int lastRecord) {
		this.lastRecord = lastRecord;
	}
}//ProductDTO
