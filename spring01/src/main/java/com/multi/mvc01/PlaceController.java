package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할
public class PlaceController {
	
	@Autowired
	PlaceDAO dao;
	
	
@RequestMapping("placeone")
public void one(String id, Model model) {
	System.out.println("placeone 요청됨.");
	System.out.println(id);
	PlaceVO bag = dao.one(id);
	//views까지 전달할 속성으로 추가해주세요
	model.addAttribute("bag", bag);
	
	
}

@RequestMapping("placelist")
public void list(Model model) {
	//Model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체 
	ArrayList<PlaceVO> list = dao.list();
	model.addAttribute("list", list);

	}
}
