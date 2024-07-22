package com.EduBridge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
	public class PlayersController {
	@Autowired
	PlayersService ps;
	@GetMapping("view")
	public List<PlayersModel> getAllRecords(){
		return this.ps.getAllPlayers();
				
	}
//	@RequestMapping(value="/players/{id}")
//	public PlayersModel getById(@PathVariable(name="id") Integer id){
//		return this.ps.getPlayerById(id);
//	}
	@PostMapping("viewI")
	public PlayersModel getPlayer(@RequestBody PlayersModel id) {
	int id1=id.getId();
	return ps.getPlayerById(id1);
    }

	@PostMapping("insert")
	public void addPlayer(@RequestBody PlayersModel p){
		this.ps.saveData(p);
	}
	@PostMapping("update")
	public void modifyPlayer(@RequestBody PlayersModel p1) {
		this.ps.updateData(p1);
	}

	@PostMapping("delete")
	public void deletePlayer(@RequestBody PlayersModel p1 ) {
		this.ps.removePlayer(p1);
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public void loginuser(@RequestBody PlayersModel p) {
		this.ps.usernamelogin(p);
		this.ps.passwordlogin(p);
	}
	}



