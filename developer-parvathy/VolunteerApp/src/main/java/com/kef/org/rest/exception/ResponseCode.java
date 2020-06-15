package com.kef.org.rest.exception;

public class ResponseCode {
	
	private String message;
	public ResponseCode(String message, String messagecode) {
		super();
		this.message = message;
		this.messagecode = messagecode;
	}
	private String messagecode;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessagecode() {
		return messagecode;
	}
	public void setMessagecode(String messagecode) {
		this.messagecode = messagecode;
	}
	
	@Override
    public String toString() {
        return "ResponseCode [message=" + message + "]";
    }
   
}
