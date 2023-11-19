package usuario.fintech.diogo.usuarios.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Value("${eureka.instance.instance-id}")
    private String idAplicacaoSpring;  

    @GetMapping
    public String listar(){
        return "listando usuarios";
    }

    @GetMapping("id-aplicacao")
    public String retornaIdAplicacao(){
        return this.idAplicacaoSpring;
    }



    
}
