package med.voll.api.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring MVC
 */

//Apontando para o SpringBoot que se trata de uma classe rest
@RestController
@RequestMapping("/hello") //mapeando a chamada da classe na url
public class HelloController {

    //metodo protocolo http (GET)
    @GetMapping
    public String olaMundo(){
        System.out.println("Chamando Hello World");
        return "Hello World Spring!";
    }
}
