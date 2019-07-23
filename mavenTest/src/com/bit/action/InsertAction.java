package com.bit.action;

import java.sql.PreparedStatement;

import com.bit.model.Struts04Dao;
import com.bit.model.entity.Struts04Dto;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class InsertAction implements Action,ModelDriven<Struts04Dto>,Preparable{
	Struts04Dto bean = null;
	//여기서 bean객체가 만들어져있어야 model에 주입을 해줄 수 있다.
	//null이 아닌 생성자로 생성을 해야함
	//하지만 필드변수에서 생성을 하는건 안 좋은 코딩....
	//필터를 하나 더 만들어준다.

	public Struts04Dto getBean() {
		return bean;
	}
	
	@Override
	public String execute() throws Exception {
//		new Struts04Dao().insertOne(bean);
//		System.out.println(bean.getSub());
//		System.out.println(bean.getName());
//		System.out.println(bean.getContent());
		new Struts04Dao().insertOne(bean);
		return this.SUCCESS;
	}

	@Override
	public Struts04Dto getModel() {
		//ModelDriven 오버라이딩
		//파라미터를 model에 전달하여 model에서 set 해주도록 한다
		//필터로 작동해 bean을 전달해준다
		return bean;
	}

	@Override
	public void prepare() throws Exception {
		bean = new Struts04Dto();
	}

	
}
