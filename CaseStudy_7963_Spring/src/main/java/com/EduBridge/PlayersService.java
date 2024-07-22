package com.EduBridge;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
	public class PlayersService {
		@Autowired
		PlayersRepository pr;	
	public PlayersService() {	
	}
	public List getAllPlayers() {
		return pr.findAll();
	}
//	public PlayersModel getPlayerById(int id) {
//		return pr.getById(id);	
//	}
	public PlayersModel getPlayerById(int id) {
		
		Optional<PlayersModel> pm=pr.findById(id);//inbuild DOA layer
		if(pm.isPresent()) {
			//System.out.println(pm.get().getName());
			return pm.get() ;
	            
		}else 
		return null;
	}
	public void saveData(PlayersModel p) {
		pr.save(p);
	}
	public void updateData(PlayersModel p1) {
		pr.save(p1);
	}
	public void removePlayer(PlayersModel p) {
		int id=p.getId();
		PlayersModel q=pr.getById(id);
		pr.delete(q);
	}
	public void usernamelogin(PlayersModel u) {
		pr.save(u);
	}
	public void passwordlogin(PlayersModel p) {
		pr.save(p);
	}

	}



