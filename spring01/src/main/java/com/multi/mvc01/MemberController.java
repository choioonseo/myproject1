package com.multi.mvc01;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할
public class MemberController {
	
	@Autowired
	MemberDAO3 dao; //전역변수(글로벌 변수) 
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	
	//컨트롤 하는 기능(CRUD)
		//회원가입, 수정, 탈퇴, 정보검색
		
		//클래스 내에서 기능처리 담당
		//멤버변수 + 멤버메서드(기능처리 담당)
		//하나의 요청당 하나의 메서드
		//하나의 버튼호출당 하나의 함수 연결!
		//요청된 주소가 어떻게 될 때
		//바로 아래에 있는 메서드가 호출이 될지를
		//써주어야 한다. 
	
	@RequestMapping("login") //클라이언트가 login을 요청하면
	public String login(MemberVO bag, HttpSession session) {
			System.out.println(bag);
			//dao를 이용해서 db처리할 예정
			//views아래로 남어감
			//views아래에 login.jsp를 호출하게 됨
			int result = dao.login(bag);
			if (result == 1)
			{
				session.setAttribute("id", bag.getId());
				return "ok";
			}
			else {
			//views아래가 아니고 webapp의 member.jsp로 다시 돌아가고 싶은 경우
				return "redirect:member.jsp";
			}
	}
	
	
		@RequestMapping("insert")
		public void insert(MemberVO bag) {
			//메서드의 입력변수(파라메터)로 변수를
			//선언해두면, 컨트롤러내의 메서드내에서는
			//1)bag을 만들어서 
			//2)클라이언트로 부터 전달된 데이터도 받아줌.
			//3)bag에 데이터 다 넣어줌.
			System.out.println("insert요청됨.");
			System.out.println(bag);
			System.out.println(dao);
			//dao에게 insert해달라고 요청
			dao.insert(bag);
		}

@RequestMapping("update")
public void update(MemberVO bag) {
	System.out.println("update 요청됨.");
	dao.update(bag);
}

@RequestMapping("delete")
public void delete(String id) {
	System.out.println("delete 요청됨.");
	dao.delete(id);
}


@RequestMapping("one")
public void one(String id, Model model) {
	System.out.println("one 요청됨.");
	System.out.println(id);
	MemberVO bag = dao.one(id);
	//views까지 전달할 속성으로 추가해주세요
	model.addAttribute("bag", bag);
	
	
}

@RequestMapping("list")
public void list(Model model) {
	//Model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체 
	ArrayList<MemberVO> list = dao.list();
	model.addAttribute("list", list);
	
	

}
}
