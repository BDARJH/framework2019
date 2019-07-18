package com.bit.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;

public class Ex01Action implements Action {
	Logger log = Logger.getLogger("com.bit.action.Ex01Action");
	@Override
	public String execute() throws Exception {
		log.debug("호출");
		//상속받은 인터페이스 action에 return값이 final로 지정되어 있다.
		return this.SUCCESS;
	}

}
