package com.itSolution.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value=Exception.class)
	public ModelAndView handleAE(ArithmeticException e) {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("problem");
		return mav;
	}
}
