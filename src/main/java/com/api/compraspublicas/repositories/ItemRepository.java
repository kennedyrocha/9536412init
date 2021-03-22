package com.api.compraspublicas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.api.compraspublicas.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

	@Transactional
	Item findByIdItem(Integer idItem);
}
