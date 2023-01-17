package com.cbc.springPortfolio.shopVendor.model.dto;

import java.sql.Date;

public class ShopVendorDTO {
	private int vendorCode;
	private String vendorName;
	private Date regiDate;
	
    private String searchGubun;
    private String searchData;
    
    private int pageNumber;
    private int startRecord;
    private int lastRecord;
    
	public int getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(int vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public Date getRegiDate() {
		return regiDate;
	}
	public void setRegiDate(Date regiDate) {
		this.regiDate = regiDate;
	}
	public String getSearchGubun() {
		if (searchGubun == null) {
			searchGubun = "";
		}//if
		return searchGubun;
	}
	public void setSearchGubun(String searchGubun) {
		this.searchGubun = searchGubun;
	}
	public String getSearchData() {
		if (searchData == null) {
			searchData = "";
		}//if
		return searchData;
	}
	public void setSearchData(String searchData) {
		this.searchData = searchData;
	}
	public int getPageNumber() {
		if (pageNumber == 0) {
			pageNumber = 1;
		}//if
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
}//ShopVendorDTO
