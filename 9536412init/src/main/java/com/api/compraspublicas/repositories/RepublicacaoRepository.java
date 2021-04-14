package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.compraspublicas.domain.Republicacao;

@Repository
public interface RepublicacaoRepository extends JpaRepository<Republicacao, Integer> {

}
