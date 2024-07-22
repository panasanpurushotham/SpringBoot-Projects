package com.EduBridge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/test")
	@ResponseBody
	public String showMsg() {
		return "Hello All!! Lets enjoy the beauty of SpringBoot!!";
		
	}
	

}
