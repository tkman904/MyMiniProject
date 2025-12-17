package com.sist.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sist.web.dao.BoardRepository;import com.sist.web.vo.BoardVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	private final BoardRepository bDao;
	
	@GetMapping("/board/list")
	public String board_list(@RequestParam(name = "page", required = false) String page, Model model) {
		if(page == null) {
			page = "1";
		}
		int curpage = Integer.parseInt(page);
		int rowSize = 10;
		int start = (curpage*rowSize)-(rowSize-1);
		int end = curpage*rowSize;
		
		List<BoardVO> list = bDao.boardListData(start, end);
		int count = (int)bDao.count();
		int totalpage = (int)(Math.ceil(count/10.0));
		
		model.addAttribute("list", list);
		model.addAttribute("curpage", curpage);
		model.addAttribute("totalpage", totalpage);
		
		model.addAttribute("main_html", "board/list");
		
		return "main/main";
	}
}
