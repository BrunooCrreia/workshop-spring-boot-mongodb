package com.correiabruno.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.correiabruno.workshopmongo.domain.User;
import com.correiabruno.workshopmongo.repository.UserRepository;

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

}
