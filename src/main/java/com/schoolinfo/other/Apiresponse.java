package com.schoolinfo.other;

public class Apiresponse {

	private String message;
	private boolean success;
	public Apiresponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apiresponse(String message, boolean success) {
		super();
		this.message = message;
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	@Override
	public String toString() {
		return "Apiresponse [message=" + message + ", success=" + success + "]";
	}
	
}
