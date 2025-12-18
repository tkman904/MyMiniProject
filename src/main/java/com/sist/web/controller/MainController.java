package com.sist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sist.web.service.CafeService;
import com.sist.web.vo.CafeVO;

import lombok.RequiredArgsConstructor;

import java.util.*;

@Controller
@RequiredArgsConstructor
public class MainController {
	private final CafeService cService;
	
	@GetMapping("/")
	public String main_page(Model model) {
		List<CafeVO> list = cService.cafeListData(); 
		
		model.addAttribute("list", list);
		
		model.addAttribute("main_html", "main/home");
		
		return "main/main";
	}
}
