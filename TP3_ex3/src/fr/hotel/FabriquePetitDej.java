package fr.hotel;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FabriquePetitDej {

	    private static final String CHAMP_CHAMBRE = "chambre";
	    private static final String CHAMP_HEURE = "heure";
	    private static final String CHAMP_NB_REPAS = "nombreDeRepas";
	    private static final String CHAMP_COMMENTAIRES = "commentaires";

	    public PetitDejeuner construitPetitDejeuner(HttpServletRequest request) {
	      
	        int chambre = Integer.parseInt(request.getParameter(CHAMP_CHAMBRE));
	        int nombreDeRepas = Integer.parseInt(request.getParameter(CHAMP_NB_REPAS));
	        String heure = request.getParameter(CHAMP_HEURE);
	        String commentaires = request.getParameter(CHAMP_COMMENTAIRES);

	      
	        return new PetitDejeuner(chambre, nombreDeRepas, heure, commentaires);
	    }
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	    FabriquePetitDej fabrique = new FabriquePetitDej();
	    PetitDejeuner petitDej = fabrique.construitPetitDejeuner(request);
	  
	    request.setAttribute("attributPetitDej", petitDej);
	
	    request.getRequestDispatcher("/WEB-INF/recapitulatif.jsp").forward(request, response);
	}
	private void validationChambre(int chambre) throws Exception {
	    if (chambre < 100 || chambre > 200) {
	        throw new Exception("Le numéro de chambre doit être compris entre 100 et 200.");
	    }
	}
	
	}

	
	    

