package com.sist.web.service;

import java.util.List;

import com.sist.web.vo.MusicVO;

public interface MusicService {
	public List<MusicVO> musicListData(int start);
	public int musicTotalPage();
	public List<MusicVO> musicTop10Data();
	public MusicVO musicDetailData(int no);
}
