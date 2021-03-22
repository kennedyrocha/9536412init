package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.compraspublicas.domain.Reversao;

@Repository
public interface ReversaoRepository extends JpaRepository<Reversao, Integer> {

}
