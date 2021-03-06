package com.my.shop.common.model;

public class Message {
	
	private StatusEnum status;
	private String message;
	private Object data;
	
	
	public Message() {
		this.status = StatusEnum.BAD_REQUEST;
		this.message = null;
		this.data = null;
	}
	
	
	public StatusEnum getStatus() {
		return status;
	}
	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
	

}
