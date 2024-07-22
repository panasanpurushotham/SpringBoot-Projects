 package com.EduBridge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayersController {
	@Autowired
	PlayersService ps;
	@RequestMapping(value="/players", method=RequestMethod.GET)
	public List<PlayersModel> getAllRecords(){
		return this.ps.getAllPlayers();
	}
	@RequestMapping(value="/players/{id}", method=RequestMethod.GET)
	public PlayersModel getById(@PathVariable(name="id")Integer id) {
		return this.ps.getPlayerById(id);
		
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void addPlayer(@RequestBody PlayersModel p) {
		this.ps.saveData(p);
	}
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void modifyPlayer(@RequestBody PlayersModel p) {
		this.ps.updatePlayer(p);
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deletePlayer(@PathVariable (name="id")Integer id) {
		this.ps.removePlayer(id);
	}
	
	

}
