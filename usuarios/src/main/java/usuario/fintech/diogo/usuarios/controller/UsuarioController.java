package usuario.fintech.diogo.usuarios.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import usuario.fintech.diogo.usuarios.model.UsuarioModel;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("usuario")
public class UsuarioController {

    /*@Value("${eureka.instance.instance-id}")
    private String idAplicacaoSpring; */ 

    @GetMapping
    @CircuitBreaker(name = "usuarios-circuit-breaker")
    public String allUsuarios(){
        var frase = "procuro a palavra PROCESSANDO";       
        var palavraProcurada = "processado";
        /*var regex = ".*"+palavraProcurada+".*";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(frase);*/
        return "A palavra processando esta na frase: " + frase.toLowerCase().contains(palavraProcurada);
    }

   /*  @PostMapping
    public UsuarioModel saveUsuario(@RequestBody SomeEnityData entity) {
      //TODO: process POST request
        
        return entity;
    }*/
    

    /*@GetMapping("id-aplicacao")
    public String retornaIdAplicacao(){
        return this.idAplicacaoSpring;
    }*/



    
}
