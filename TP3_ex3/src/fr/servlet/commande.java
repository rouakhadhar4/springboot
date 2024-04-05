package fr.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.hotel.FabriquePetitDej;
import fr.hotel.PetitDejeuner;

@WebServlet("/commande")
public class commande extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public commande() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/formulaire.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FabriquePetitDej fabrique = new FabriquePetitDej();
        PetitDejeuner petitDej = fabrique.construitPetitDejeuner(request);
        Map<String, String> erreurs = fabrique.getErreurs(); 

        if (fabrique.succesCreation) {
        	request.setAttribute("petitDej", petitDej);
        	request.getRequestDispatcher("/WEB-INF/recapitulatif.jsp").forward(request, response);
} else {
            request.setAttribute("erreurs", erreurs); 
            request.getRequestDispatcher("/WEB-INF/formulaire.jsp").forward(request, response);
        }
    }

}
