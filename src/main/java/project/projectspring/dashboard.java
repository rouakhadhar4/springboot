package project.projectspring;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class dashboard {

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String showHomePage() {
        return "dashboard"; // le nom du fichier HTML que vous allez créer
    }
}