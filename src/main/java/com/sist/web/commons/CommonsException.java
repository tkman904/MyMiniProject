package com.sist.web.commons;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonsException {
	@ExceptionHandler(Exception.class)
	public void exception(Exception ex) {
		System.out.println("======== Exception 발생 ========");
		ex.printStackTrace();
	}
	
	@ExceptionHandler(Throwable.class)
	public void throwable(Throwable ex) {
		System.out.println("======== Throwable 발생 ========");
		ex.printStackTrace();
	}
}
