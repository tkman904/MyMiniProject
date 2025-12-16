package com.sist.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.sist.web.vo.*;

import java.util.*;

@Mapper
@Repository
public interface HobbyMapper {
	@Select("SELECT b_id, b_title, b_thumbnail, b_type, b_filter "
			+ "FROM board "
			+ "WHERE b_type = '취미/자기개발' "
			+ "OFFSET #{start} ROWS FETCH NEXT 12 ROWS ONLY")
	public List<HobbyVO> hobbyListData(int start);
	
	@Select("SELECT CEIL(COUNT(*)/12.0) FROM board")
	public int hobbyTotalPage();
	
	// Footer
	@Select("SELECT b_id, b_title, ROWNUM "
			+ "FROM (SELECT b_id, b_title "
			+ "FROM board "
			+ "WHERE b_type = '취미/자기개발' "
			+ "ORDER BY b_view_count DESC) "
			+ "WHERE ROWNUM<=10")
	public List<HobbyVO> hobbyTop10Data();
}
