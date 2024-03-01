package tp2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

/**
 * Servlet implementation class CalculDeMonImc
 */
@WebServlet("/CalculDeMonImc")
public class CalculDeMonImc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculDeMonImc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double poids = Double.parseDouble(request.getParameter("poids"));
		double taille = Double.parseDouble(request.getParameter("taille"));
		/*
		double imc=poids/(taille*taille);
		*/
		Imc imc = new Imc (poids,taille);
		double resultatImc = imc.calacul();
		
		Cookie poidsCookie = new Cookie("poids", String.valueOf(poids));
	    Cookie tailleCookie = new Cookie("taille", String.valueOf(taille));
	    Cookie imcCookie = new Cookie("imc", String.valueOf(resultatImc));
	    
	    response.addCookie(poidsCookie);
	    response.addCookie(tailleCookie);
	    response.addCookie(imcCookie);
	    
	   
		response.getWriter().append("Indice de masse corporelle est:  "+resultatImc);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
