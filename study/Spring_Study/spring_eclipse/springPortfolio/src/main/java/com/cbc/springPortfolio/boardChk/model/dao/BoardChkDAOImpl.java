package com.cbc.springPortfolio.boardChk.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.cbc.springPortfolio.boardChk.model.dto.BoardChkDTO;

@Repository
public class BoardChkDAOImpl implements BoardChkDAO {

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<BoardChkDTO> getSelectAll(BoardChkDTO paramDto) {
		return sqlSession.selectList("boardChk.getSelectAll", paramDto);
	}//getSelectAll

	@Override
	public BoardChkDTO getSelectOne(BoardChkDTO paramDto) {
		return sqlSession.selectOne("boardChk.getSelectOne", paramDto);
	}//getSelectOne

	@Override
	public int setInsert(BoardChkDTO paramDto) {
		return sqlSession.insert("boardChk.setInsert", paramDto);
	}//setInsert

	@Override
	public int setUpdate(BoardChkDTO paramDto) {
		return sqlSession.update("boardChk.setUpdate", paramDto);
	}//setUpdate

	@Override
	public int setDelete(BoardChkDTO paramDto) {
		return sqlSession.delete("boardChk.setDelete", paramDto);
	}//setDelete

	@Override
	public int getTotalRecord(BoardChkDTO paramDto) {
		return sqlSession.selectOne("boardChk.getTotalRecord", paramDto);
	}//getTotalRecord
}//BoardChkDAOImpl
