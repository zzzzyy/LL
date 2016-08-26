package com.atguigu.spring.action;

import org.springframework.stereotype.Controller;

import com.atguigu.spring.bean.User;

@Controller
public class UserAction extends BaseAction<User>{

	//@Autowired
	//private UserService service;
	//private BaseService service ; 
	
	public String saveUser(){
		
		service.save();
		
		return "success";
	}
	
}
