package com.ruby.exception;

public class UserDefinedException extends RuntimeException{

	/*private static final long serialVersionUID = 1L;*/
private String name;
private String msg;
public UserDefinedException(String name, String msg) {
	super();
	this.name = name;
	this.msg = msg;
}
public String getMsg() {
	return msg;
}
public String getName() {
	return name;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public void setName(String name) {
	this.name = name;
}
}
