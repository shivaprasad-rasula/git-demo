package com.git.test.Git_Demo;

public class CustmeException extends RuntimeException {

	private String msg;
	
	public CustmeException(String msg) {
		super(msg);
		//System.out.println(msg);
		//this.msg = msg;
	}


	
	
	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	
}
