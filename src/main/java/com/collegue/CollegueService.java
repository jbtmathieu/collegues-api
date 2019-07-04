package com.collegue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class CollegueService {

	    private Map<String, Collegue> data = new HashMap<>();

	    public CollegueService() {
	    	Collegue coll;
	    	coll=new Collegue(UUID.randomUUID().toString(),"SMITH","Jean","123@greatcorp.com",
	    			LocalDate.now(),"my/great/path.png");
	        data.put("123", coll);
	        coll=new Collegue("111","BIG","Jacques","111@greatcorp.com",
	    			LocalDate.now(),"my/great/path.png");
	        data.put("111", coll);
	        coll=new Collegue("223","SMITH","Pierre","223@greatcorp.com",
	    			LocalDate.now(),"my/great/path.png");
	        data.put("223", coll);
	        coll=new Collegue("323","RAY","John","jean.323@greatcorp.com",
	    			LocalDate.now(),"my/great/path.png");
	        data.put("323", coll);
	        coll=new Collegue("125","MARTIN","Will","125@greatcorp.com",
	    			LocalDate.now(),"my/great/path.png");
	        data.put("125", coll);
	    }
	    
	    
	    public List<Collegue> rechercherParNom(String nomRecherche) {
	        // TODO retourner une liste de collègues dont le nom est fourni
	    	

	    	List<Collegue> collegues = new ArrayList<Collegue>();
	    	if ( nomRecherche != null) {
	    	data.forEach((id, coll) -> {
				if(coll.getNom().equals(nomRecherche)) {
					collegues.add(coll);
				}
			});
	    	}
	    	return collegues;
	    	
	    }

	    public Collegue rechercherParMatricule(String matriculeRecherche) {
	    	
	    	if ( matriculeRecherche != null) {
	    	
	    	Collegue colle = null;
	    	for (Map.Entry<String, Collegue> entry : data.entrySet()) { 
	            if (entry.getValue().getMatricule().equals(matriculeRecherche)) {
	            	colle=entry.getValue();
	            	return colle;
	            }
	    		}
	    	if (colle==null) {
	    		try {
					throw new CollegueNontrouveException();
				} catch (CollegueNontrouveException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    	}
	    	return null;
	    	
	    }
	    public Collegue ajouterUnCollegue(Collegue collegueAAjouter) {
	    	// TODO Vérifier que le nom et les prenoms ont chacun au moins 2 caractères
	    	
	        // TODO Vérifier que l'email a au moins 3 caractères et contient `@`
	        // TODO Vérifier que la photoUrl commence bien par `http`
	        // TODO Vérifier que la date de naissance correspond à un age >= 18
	        // TODO Si une des règles ci-dessus n'est pas valide, générer une exception :
	        // `CollegueInvalideException`.


	        // TODO générer un matricule pour ce collègue (`UUID.randomUUID().toString()`)

	        // TODO Sauvegarder le collègue
	    }

}
