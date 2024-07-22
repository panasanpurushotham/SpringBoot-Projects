package com.EduBridge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EduBridge.model.Edubridge;
import com.EduBridge.repository.EdubridgeRepository;



@Service
public class EdubridgeService {
	@Autowired
	EdubridgeRepository er;
	
	public List<Edubridge> getAllRecords(){
		return er.findAll();
	}
	public Edubridge addStudent(Edubridge e) {
		return er.save(e);
	}
	public void deleteStudent(int id) {
		er.deleteById(id);
	}

}
