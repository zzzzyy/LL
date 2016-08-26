package com.atguigu.spring.action;

import org.springframework.stereotype.Controller;

import com.atguigu.spring.bean.Order;

@Controller
public class OrderAction extends BaseAction<Order>{
	
	//@Autowired
	//private OrderService service ;
	//private BaseService service ;
	
	public String saveOrder(){
		
		service.save();
		
		return "successs";
	}
	
}
