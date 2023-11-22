package com.correiabruno.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.correiabruno.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class Resources {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "maria Brown", "maria@gmail.com");
		User alex = new User("2", "alex greem", "alex@gmail.com");
		// não pode instanciar lista então o arraylist é uma implementação de list.
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);

	}

}
