package com.bit.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.bit.model.Struts04Dao;
import com.bit.model.entity.Struts04Dto;

public class ListAction implements Action{

	private List<Struts04Dto> list;

	public List<Struts04Dto> getList(){
		return list;
	}
	
	@Override
	public String execute() throws Exception {
		list = new Struts04Dao().getList();
		return this.SUCCESS;
	}

}
