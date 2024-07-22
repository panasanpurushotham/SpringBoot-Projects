package com.EduBridge;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PathVariable1 {
//	@RequestMapping(value="/emp/{userId}",method=RequestMethod.GET)
//	public String getId(@PathVariable("userId")Integer n) {
//		Integer i = 2;
//		
//		if(n%i==0) {
//			System.out.println("no. is prime no");
//		}
//		else {
//			System.out.println("no. is not a prime no");
//
//		}
//		
//		
//		return String.valueOf(n);
//		
//			
//			
//		}
//		}
	
    @RequestMapping(value="/uname",method=RequestMethod.GET)
	public String getName(@RequestParam(name="username") String name) {
		return name;
		
	}
}

