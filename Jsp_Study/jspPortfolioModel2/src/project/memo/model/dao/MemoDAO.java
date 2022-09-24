package project.memo.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import project.common.DB;
import project.memo.model.dto.MemoDTO;

public class MemoDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ArrayList<MemoDTO> getSelectAll() {
		ArrayList<MemoDTO> memoList = new ArrayList<>();
		conn = DB.dbConn();
		try {
			String sql = "SELECT * FROM memo ORDER BY no DESC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MemoDTO memoDto = new MemoDTO();
				memoDto.setNo(rs.getInt("no"));
				memoDto.setWriter(rs.getString("writer"));
				memoDto.setContent(rs.getString("content"));
				memoDto.setRegiDate(rs.getDate("regiDate"));
				memoList.add(memoDto);
			}//while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DB.dbConnClose(rs, pstmt, conn);
		}//try-catch-finally
		return memoList;
	}//getSelectAll
}//MemoDAO
