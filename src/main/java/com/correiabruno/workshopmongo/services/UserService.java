package com.correiabruno.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.correiabruno.workshopmongo.domain.User;
import com.correiabruno.workshopmongo.dto.UserDTO;
import com.correiabruno.workshopmongo.repository.UserRepository;
import com.correiabruno.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	// A anotação @Autowired é usada no Spring Framework para injetar dependências
	// em um bean. Em palavras leigas, isso significa que a anotação @Autowired diz
	// ao Spring Framework para criar uma instância de uma classe e injetá-la em um
	// atributo de outra classe
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();

	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("objeto não encontrado"));
	}

	public User insert(User obj) {
		return repo.insert(obj);

	}

	public void delete(String id) {
		findById(id);
		repo.deleteById(id);

	}

	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}

}
