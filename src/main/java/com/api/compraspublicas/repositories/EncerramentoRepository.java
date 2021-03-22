package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.compraspublicas.domain.Encerramento;

@Repository
public interface EncerramentoRepository extends JpaRepository<Encerramento, Integer> {

}
