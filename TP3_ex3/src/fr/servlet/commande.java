package fr.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.hotel.FabriquePetitDej;
import fr.hotel.PetitDejeuner;

import javax.servlet.RequestDispatcher;

@WebServlet("/commande")
public class commande extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public commande() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/formulaire.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        
          FabriquePetitDej f= new FabriquePetitDej();
		
		PetitDejeuner p=f.construitPetitDejeuner(request);
		
		
		request.setAttribute("attributPetitDej", p );
		
		
		
		request.getRequestDispatcher("/WEB-INF/recapitulatif.jsp").forward(request, response);


    }
  
        
       

    private boolean testHeure(String heure) {
        int h = Integer.parseInt(heure.split(":")[0]);
        return (6 <= h) && (h <= 10);
    }
}
