package ai.thirdapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ai.thirdapp.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@GetMapping("aliens")
	
	public List<Alien> getaliens()
	{
	List<Alien> l=repo.findAll();	
	return l;
	
	}
	@GetMapping("alien/{aid}")
	
	public Alien getAlien(@PathVariable("aid") int aid)
	{
		Alien alien = repo.findById(aid).orElse(new Alien(0,""));
		return alien;
	}
	
	@PostMapping("alien")
	public Alien putAlien(Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	

}
