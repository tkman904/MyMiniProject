package com.sist.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sist.web.mapper.HobbyMapper;
import com.sist.web.vo.HobbyVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HobbyServiceImpl implements HobbyService {
	private final HobbyMapper mapper;

	@Override
	public List<HobbyVO> hobbyListData(int start) {
		// TODO Auto-generated method stub
		return mapper.hobbyListData(start);
	}

	@Override
	public int hobbyTotalPage() {
		// TODO Auto-generated method stub
		return mapper.hobbyTotalPage();
	}

	@Override
	public List<HobbyVO> hobbyTop10Data() {
		// TODO Auto-generated method stub
		return mapper.hobbyTop10Data();
	}
}
