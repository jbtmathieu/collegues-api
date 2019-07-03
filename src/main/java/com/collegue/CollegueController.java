package com.collegue;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collegues")
public class CollegueController {
	CollegueService collService;
	
	public CollegueController() {
		super();
		collService=new CollegueService();
	}

	@RequestMapping(
			method=RequestMethod.GET)
	public List<String> RecupParamRequete(@RequestParam String name) {
		List<Collegue> collegues=collService.rechercherParNom(name);
		List<String>  response= new ArrayList<String>();
		for (int i=0; i < collegues.size();i++) {
			response.add(collegues.get(i).getMatricule());
		}
		
		return response;

	}
	
	@RequestMapping(
			method=RequestMethod.GET,
			path="/collegues")
	public Collegue ChercheMatricule(@RequestParam String name) {
		Collegue collegue;

		
		return collService.rechercherParMatricule(name);

	}

}
