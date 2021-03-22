package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.compraspublicas.domain.MensagemPregoeiro;

@Repository
public interface MensagemPregoeiroRepository extends JpaRepository<MensagemPregoeiro, Integer> {

}
