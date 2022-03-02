package com.challenge.seariTest.repository;

import com.challenge.seariTest.model.Pizza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza, Long> {

}