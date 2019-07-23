package com.bit.action;

import java.sql.PreparedStatement;

import com.bit.model.Struts04Dao;
import com.bit.model.entity.Struts04Dto;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class InsertAction implements Action,ModelDriven<Struts04Dto>,Preparable{
	Struts04Dto bean = null;
	//���⼭ bean��ü�� ��������־�� model�� ������ ���� �� �ִ�.
	//null�� �ƴ� �����ڷ� ������ �ؾ���
	//������ �ʵ庯������ ������ �ϴ°� �� ���� �ڵ�....
	//���͸� �ϳ� �� ������ش�.

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
		//ModelDriven �������̵�
		//�Ķ���͸� model�� �����Ͽ� model���� set ���ֵ��� �Ѵ�
		//���ͷ� �۵��� bean�� �������ش�
		return bean;
	}

	@Override
	public void prepare() throws Exception {
		bean = new Struts04Dto();
	}

	
}
