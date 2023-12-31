package usuario.fintech.diogo.usuarios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import usuario.fintech.diogo.usuarios.model.UsuarioModel;
import usuario.fintech.diogo.usuarios.repository.UsuarioRepository;

@SpringBootTest
class UsuariosApplicationTests {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Test
	void contextLoads() {

		UsuarioModel usuario = UsuarioModel.builder()
				.id(10L)
				.nome("Teste")
				.senha("123")
				.build();
		UsuarioModel usuarioSalvo = usuarioRepository.save(usuario);
		Optional<UsuarioModel> usuarioDoBanco = usuarioRepository.findById(usuarioSalvo.getId());
		assertNotNull(usuarioDoBanco.get());
		assertEquals("Teste", usuarioDoBanco.get().getNome());
		assertEquals("123", usuarioDoBanco.get().getSenha());	
	}
}
