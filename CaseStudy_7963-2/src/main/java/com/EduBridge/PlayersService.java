package com.EduBridge;

import java.util.List;

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
	
	public PlayersModel getPlayerById(int id) {
		
				return pr.getById(id);
		}
		
//	
//	public void saveData(PlayersModel p) {
//		pr.save(p);
//	}
//	public void updatePlayer(PlayersModel p1) {
//		
//	}
//	public void removePlayer(int id) {
//		
//	}
	

}
