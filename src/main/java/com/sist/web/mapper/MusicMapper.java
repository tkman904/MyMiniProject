package com.sist.web.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.sist.web.vo.*;

@Mapper
@Repository
public interface MusicMapper {
	@Select("SELECT * FROM genie_music "
			+ "ORDER BY no ASC "
			+ "OFFSET #{start} ROWS FETCH NEXT 12 ROWS ONLY")
	public List<MusicVO> musicListData(int start);
	
	@Select("SELECT CEIL(COUNT(*)/12.0) FROM genie_music")
	public int musicTotalPage();
	
	@Select("SELECT no, title, singer, rank, ROWNUM "
			+ "FROM (SELECT no, title, singer, rank "
			+ "FROM genie_music "
			+ "WHERE cno = 1 "
			+ "ORDER BY rank ASC) "
			+ "WHERE ROWNUM<=10")
	public List<MusicVO> musicTop10Data();
	
	@Update("UPDATE genie_music SET "
			+ "hit = hit+1 "
			+ "WHERE no = #{no}")
	public void musicHitIncrement(int no);
	
	@Select("SELECT no, rank, title, singer, album, poster, state, idcrement, hit, likecount "
			+ "FROM genie_music "
			+ "WHERE no = #{no}")
	public MusicVO musicDetailData(int no);	
}
