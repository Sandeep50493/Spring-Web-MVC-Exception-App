package com.itSolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@GetMapping("/demo")
	@ResponseBody
	public String getDemoMsg() {
		String msg=null;
		msg.length();
		return msg;
	}
}
