package Funtec.meuprimeirowebapi.controller;


import Funtec.meuprimeirowebapi.model.Usuario;
import Funtec.meuprimeirowebapi.repository.UsuarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


//o controller só da um direcionamento a nossa aplicação
//recomentado não colocar regras de negocio no controller, mas sim em outra camada da aplicação
@RestController

public class UsuarioController {
		//agora vamos buscar a lista que esta em nosso repositorio
		//colocamos o @Autowired, pra buscar nossa implementação, ele que contem a inteligencia
	@Autowired
	private UsuarioRepository repository; //o repository que tem a logica do negocio
	 
	@GetMapping("/users") //verbo necessário para nossa interação
	//colocamos o users para diferenciar do GetMapping da outra classe. Precisamos nos preocupar com isso
	
	
	//metodo pra listar nossos usuarios
		public List<Usuario> getUsers(){
			return repository.findAll();
			}
	//o nosso controller, através do HTTP delegou para outra classe, que tem condição
		//de fazer a regra de negócio.

@GetMapping("/users/{username}") //parametro q vier da url
//vamos buscar um usuário
public Usuario getOne(@PathVariable("username")String username){
	//com o @PathVariable veja a possição ou nome da variavel
		return repository.findByUsername(username);
		}
   
	
	@DeleteMapping("/users/{id}")
	public void deleteUser (@PathVariable("id") Integer id) {
		repository.deleteById(id);
	}
	
	@PostMapping("/users")
	public void postUser(@RequestBody Usuario usuario) { //recebendo um usuario
	repository.save(usuario);
	}
	
}



