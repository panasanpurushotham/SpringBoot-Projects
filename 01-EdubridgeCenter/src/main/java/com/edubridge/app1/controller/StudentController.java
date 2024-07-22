package com.edubridge.app1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.app1.model.Student;
import com.edubridge.app1.service.StudentService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentService es;
	
//	@GetMapping("/test")
//	public String test() {
//		return "ok tested";
//		
//	}
	@GetMapping("/view")
	public List<Student>getAllRecords(){
		return this.es.getAllRecords();
	}
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student e) {
		return this.es.addStudent(e);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable int id) {
		es.deleteStudent(id);
	}
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student e) {
		return es.updateStudent(id, e);
	}
	@GetMapping("/search/{batchcode}")
	public List<Student> findByBatch(@PathVariable int batchcode){
		return es.findByBatch(batchcode);
	}
	

}
