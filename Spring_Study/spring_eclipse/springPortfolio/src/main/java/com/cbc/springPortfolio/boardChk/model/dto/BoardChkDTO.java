package com.cbc.springPortfolio.boardChk.model.dto;

import java.sql.Date;

public class BoardChkDTO {
	private int boardChkNo;
	private String tbl;
	private String tblName;
	private Date regiDate;
	
    private String searchGubun;
    private String searchData;
    
    private int pageNumber;
    private int startRecord;
    private int lastRecord;
    
	public int getBoardChkNo() {
		return boardChkNo;
	}
	public void setBoardChkNo(int boardChkNo) {
		this.boardChkNo = boardChkNo;
	}
	public String getTbl() {
		return tbl;
	}
	public void setTbl(String tbl) {
		this.tbl = tbl;
	}
	public String getTblName() {
		return tblName;
	}
	public void setTblName(String tblName) {
		this.tblName = tblName;
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
}//BoardChkDTO
