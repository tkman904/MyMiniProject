package com.sist.web.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.sist.web.vo.*;

@Mapper
@Repository
public interface CafeMapper {
	@Select("SELECT id, category_name, menu_name, image_url, ROWNUM "
			+ "FROM (SELECT id, category_name, menu_name, image_url "
			+ "FROM cafe ORDER BY id DESC) "
			+ "WHERE ROWNUM<=8")
	public List<CafeVO> cafeListData();
}
