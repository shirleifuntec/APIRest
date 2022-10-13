package Funtec.meuprimeirowebapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Funtec.meuprimeirowebapi.model.Usuario;

//componente repository
@Repository 
public class UsuarioRepository {
	
	public void save(Usuario usuario) {
		if(usuario.getId()==null)
		System.out.println("SAVE - Recebendo o usuário na camada de repositoório ");
		else
			System.out.println("UPDATE -Recebendo o usuário na camada de repositoório ");
		
		System.out.println(usuario);
	}
	
	public void deleteById(Integer id) {
		System.out.println(String.format("DELETE/id - Recebenso o id: %d para delete"));
		System.out.println(id);
	}

	public List<Usuario> findAll(){
		System.out.println("LIST - Listando os usuários do sistema");
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("shirlei", "123456"));
		usuarios.add(new Usuario("paulo", "654321"));
		return usuarios;
	}
	
	public Usuario findById(Integer id) {
		System.out.println(String.format("FIND/id - Recebenso o id: %d para localizar um usuário"));
		return new Usuario("shirlei", "123456");
	}
		
	public Usuario findByUsername(String username) {
		System.out.println(String.format("FIND/username - Recebendo o username: %s "));
		return new Usuario("shirlei", "123456");
	}
	
	
	
	}
	
	

