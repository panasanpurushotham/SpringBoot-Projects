package com.EduBridge;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlayersService {
	List<PlayersModel> list=new ArrayList<PlayersModel>();
	public PlayersService() {
		list.add(new PlayersModel(1,"Sachin Tendulkar"));
		list.add(new PlayersModel(2,"MS Dhoni"));
		list.add(new PlayersModel(3,"Saurav Ganguly"));
		list.add(new PlayersModel(4,"Rahul Dravid"));

	}
	public List getAllPlayers() {
		return list;
	}
	
	public PlayersModel getPlayerById(int id) {
		for(PlayersModel p:list) {
			if(p.getId()==id)
				return p;
		}
		return null;
	}
	public void saveData(PlayersModel p) {
		this.list.add(p);
	}
	public void updatePlayer(PlayersModel p1) {
		for(PlayersModel p:list) {
			if(p.getId()==p1.getId()) {
				p.setName(p1.getName());
			}
			
		}
	}
	public void removePlayer(int id) {
		this.list.remove(id);
	}
	

}
