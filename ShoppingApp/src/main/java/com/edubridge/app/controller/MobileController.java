package com.edubridge.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.edubridge.app.entity.MobileShop;
import com.edubridge.app.service.MobileService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class MobileController {
	@Autowired
	private MobileService service;
	
	//http://localhost:8181/myapp/api/mobile

	@PostMapping("/mobile")
	public ResponseEntity<?> save(@RequestBody MobileShop mobile){
		MobileShop savedMobile = service.saveMobile(mobile);
		return new ResponseEntity<>(savedMobile, HttpStatus.CREATED);
	}
	
	@GetMapping("/mobile")
	public ResponseEntity<?> getAllMobiles(){
		List<MobileShop> mobileList = service.getMobiles();
		return new ResponseEntity<>(mobileList, HttpStatus.OK);
	}
	
	@GetMapping("/mobile/{id}")
	public ResponseEntity<?> getSingleMobile(@PathVariable Integer id){
		MobileShop mobile = service.getMobile(id);
		return new ResponseEntity<>(mobile, HttpStatus.OK);
	}
	@GetMapping("/mobile/{model}")
	public ResponseEntity<?> getMobileModel(@PathVariable String model){
		List<MobileShop> mobile = service.searchMobile(model);
		return new ResponseEntity<>(mobile, HttpStatus.OK);
		
	}
	
	@PutMapping("/mobile")
	public ResponseEntity<?> update(@RequestBody MobileShop mobile ){
		service.updateMobile(mobile);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/mobile/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		service.deleteMobile(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
