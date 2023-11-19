package usuario.fintech.diogo.usuarios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UsuarioModel {
    @Id
    private Long id;
    private String nome;
    private String senha;
    
}
