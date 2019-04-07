package com.javaplsql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javaplsql.model.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer>{
	
	@Query(value = "{ call sp_findName }", nativeQuery = true)
	public List<Autor> buscarAutorProcedure();
	
}
