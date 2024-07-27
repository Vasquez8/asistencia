package esfe.AsistenciaEsfe.controladores;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeControler {

    @RequestMapping("/")
    public  String index(){
        return "home/index";
    }
}
