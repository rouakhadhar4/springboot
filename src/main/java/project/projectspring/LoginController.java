package project.projectspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/authenticate")
	public String showLoginPage() {
	    return "login";
	}


    @PostMapping("/authenticate")
    public String authenticate(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        if ("roua".equals(username) && "211".equals(password)) {
            return "redirect:/dashboard"; // Redirige vers la page d'accueil si l'authentification est réussie
        } else {
            model.addAttribute("error", "username ou password incorrect"); // Ajoute un attribut d'erreur au modèle
            return "login"; // Recharge la page de connexion avec un message d'erreur
        }
    }
}





