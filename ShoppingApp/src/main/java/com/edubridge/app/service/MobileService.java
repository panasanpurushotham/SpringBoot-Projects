package com.edubridge.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app.entity.MobileShop;
import com.edubridge.app.repo.MobileRepository;

@Service
public class MobileService {

	@Autowired
	private MobileRepository repo;
	
	public MobileShop saveMobile(MobileShop mobile) {
		return repo.save(mobile);
	}
	
	public List <MobileShop> getMobiles() {
		return repo.findAll();
	}
	
	public MobileShop getMobile(Integer id) {
		return repo.findById(id).get();
	}
	
	public List<MobileShop> searchMobile(String model) {
		return repo.findByModel(model);
	}

	public void  updateMobile(MobileShop mobile) {
		repo.save(mobile);	
	}
	
	public void deleteMobile(Integer id) {
		repo.deleteById(id);
	}
	
}
