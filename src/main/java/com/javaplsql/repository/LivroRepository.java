package com.javaplsql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaplsql.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
