package com.correiabruno.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.correiabruno.workshopmongo.domain.User;
import com.correiabruno.workshopmongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		// não pode instanciar lista então o arraylist é uma implementação de list.
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}

}
