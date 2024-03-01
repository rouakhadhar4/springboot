package tp2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableauDeBord
 */
@WebServlet("/TableauDeBord")
public class TableauDeBord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TableauDeBord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 Cookie[] cookies = request.getCookies();

	        
	        double poids = 0.0;
	        double taille = 0.0;
	        double resultatImc = 0.0;

	       
	        if (cookies != null) {
	            for (Cookie cookie : cookies) {
	                switch (cookie.getName()) {
	                    case "poids":
	                        poids = Double.parseDouble(cookie.getValue());
	                        break;
	                    case "taille":
	                        taille = Double.parseDouble(cookie.getValue());
	                        break;
	                    case "imc":
	                    	resultatImc = Double.parseDouble(cookie.getValue());
	                        break;
	                    default:
	                        break;
	                }
	            }
	        }

	       
	        response.setContentType("text/html");
	        response.getWriter().println("<html><body>");
	        response.getWriter().println("<h1>Tableau de Bord</h1>");
	        response.getWriter().println("<p>Poids: " + poids + "</p>");
	        response.getWriter().println("<p>Taille: " + taille + "</p>");
	        response.getWriter().println("<p>IMC: " + resultatImc + "</p>");
	        response.getWriter().println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
