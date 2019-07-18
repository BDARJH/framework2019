package com.bit.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;

public class Ex03Action implements Action {
	Logger log = Logger.getLogger("com.bit.action.Ex03Action");
	String id;
	int num;
	
	public void setId(String id) {
		//setter를 이용하여 넘어온 param값을 자동으로 주입할 수 있다.
		this.id = id;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getId() {
		return id;
	}
	
	public int getNum() {
		return num;
	}
	
	@Override
	public String execute() throws Exception {
		//param으로 넘어온 id를 받아내기
		log.debug("param : "+id);
		log.debug("param : "+num); //param 숫자로 자동으로 받아짐 (형변환 자동)
		return this.SUCCESS;
	}

}
