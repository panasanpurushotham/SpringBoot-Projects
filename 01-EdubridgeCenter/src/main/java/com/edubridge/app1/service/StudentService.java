package com.edubridge.app1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app1.model.Student;
import com.edubridge.app1.repository.StudentRepository;



@Service
public class StudentService {
	@Autowired
	StudentRepository sr;
	
	public List<Student> getAllRecords(){
		return sr.findAll();
	}
	public Student addStudent(Student s) {
		return sr.save(s);
	}
	public void deleteStudent(int id) {
		sr.deleteById(id);
	}
	public Student updateStudent(int id,Student s) {
		s.setId(id);
		return sr.save(s);
	}
	public List<Student> findByBatch(int batchcode){
		return this.sr.findByBatch(batchcode);
		
	}

}
