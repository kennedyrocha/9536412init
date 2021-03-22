package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.compraspublicas.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
