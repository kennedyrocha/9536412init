package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.compraspublicas.domain.Suspensao;

@Repository
public interface SuspensaoRepository extends JpaRepository<Suspensao, Integer> {

}
