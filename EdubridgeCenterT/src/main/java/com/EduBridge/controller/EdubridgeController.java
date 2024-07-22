package com.EduBridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EduBridge.model.Edubridge;
import com.EduBridge.service.EdubridgeService;



@RestController
@RequestMapping("/app")
//@CrossOrigin(origins="http://localhost:4200")
public class EdubridgeController {
	@Autowired
	EdubridgeService es;
	
	@GetMapping("/test")
	public String test() {
		return "ok tested";
		
	}
	@GetMapping("/view")
	public List<Edubridge>getAllRecords(){
		return this.es.getAllRecords();
	}
	@PostMapping("/addstudent")
	public Edubridge addStudent(@RequestBody Edubridge e) {
		return this.es.addStudent(e);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable int id) {
		es.deleteStudent(id);
	}
	
	

}
