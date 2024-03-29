package com.cbc.springStudy.guestBook.model.dao;

import java.util.List;

import com.cbc.springStudy.guestBook.model.dto.GuestBookDTO;

public interface GuestBookDAO {
	public List<GuestBookDTO> getSelectAll(); 
	public GuestBookDTO getSelectOne(GuestBookDTO paramDto); 
	public int setInsert(GuestBookDTO paramDto); 
	public int setUpdate(GuestBookDTO paramDto); 
	public int setDelete(GuestBookDTO paramDto); 
}//GuestBookDAO
