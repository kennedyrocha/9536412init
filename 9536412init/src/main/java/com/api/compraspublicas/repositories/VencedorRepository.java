package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.compraspublicas.domain.Vencedor;

@Repository
public interface VencedorRepository extends JpaRepository<Vencedor, Integer> {

}
