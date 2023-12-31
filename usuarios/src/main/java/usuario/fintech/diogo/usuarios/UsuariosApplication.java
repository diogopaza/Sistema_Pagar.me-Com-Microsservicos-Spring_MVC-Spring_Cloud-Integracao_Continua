package usuario.fintech.diogo.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;
import usuario.fintech.diogo.usuarios.model.UsuarioModel;

@SpringBootApplication
@Log4j2
public class UsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuariosApplication.class, args);		
	}

}
