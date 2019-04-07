package com.javaplsql.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaplsql.repository.AutorRepository;

@RestController
@RequestMapping("/autor")
public class AutorResource {
	
	@Autowired
	private AutorRepository repo;

	@GetMapping
	public ResponseEntity<?> listAutor(Pageable paginacao){
		return new ResponseEntity<>(repo.findAll(paginacao), HttpStatus.OK);
	}
	
	@GetMapping("/procedure")
	public ResponseEntity<?> listAutorProcedure(){
		return new ResponseEntity<>(repo.buscarAutorProcedure(), HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
