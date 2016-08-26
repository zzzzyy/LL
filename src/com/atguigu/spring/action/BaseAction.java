package com.atguigu.spring.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.spring.service.BaseService;

public class BaseAction<T> {
	
	//根据父类类型进行装配子类对象，会查找两个子类对象，不能确定将哪一个子类对象依赖注入进来
	//可以通过泛型来决定到底注入哪一个子类的Bean对象。
	@Autowired	
	protected BaseService<T> service ; 
	
}
