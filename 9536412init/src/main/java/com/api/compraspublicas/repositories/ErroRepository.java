package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.compraspublicas.domain.Erro;

@Repository
public interface ErroRepository extends JpaRepository<Erro, Integer> {

}
