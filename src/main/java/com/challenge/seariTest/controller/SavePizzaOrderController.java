package com.challenge.seariTest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import com.challenge.seariTest.model.Pizza;
import com.challenge.seariTest.repository.PizzaRepository;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;

@RestController
public class SavePizzaOrderController {
    
    @Autowired
    ConfigurableApplicationContext context;

    @PostMapping("/savePizzaOrder")
    @ResponseBody
    public ResponseEntity savePizzaOrder(
        @Valid @RequestBody Pizza pizza, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return new ResponseEntity(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        }

        PizzaRepository pizzaRepository = context.getBean(PizzaRepository.class);
        pizzaRepository.save(pizza);
        return new ResponseEntity<>("Order saved successfully", HttpStatus.OK);
    }
    
}