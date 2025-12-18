package com.sist.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sist.web.mapper.CafeMapper;
import com.sist.web.vo.CafeVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CafeServiceImpl implements CafeService {
	private final CafeMapper mapper;

	@Override
	public List<CafeVO> cafeListData() {
		// TODO Auto-generated method stub
		return mapper.cafeListData();
	}
}
