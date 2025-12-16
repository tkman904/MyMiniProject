package com.sist.web.service;

import java.util.List;

import com.sist.web.vo.HobbyVO;

public interface HobbyService {
	public List<HobbyVO> hobbyListData(int start);
	public int hobbyTotalPage();
}
