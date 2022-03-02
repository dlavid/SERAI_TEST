package com.challenge.seariTest.controller;

import java.util.*;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.ConfigurableApplicationContext;

@RestController
public class GenPizzaOrderController {

    @RequestMapping("/genPizzaOrder")
    public Map<String, Object> genPizzaOrder() {

        Random r = new Random();
        int randomInt1 = r.nextInt(100) + 1;
        int randomInt2 = r.nextInt(100) + 1;
        int randomInt3 = r.nextInt(100) + 1;

        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "Pizza-"+String.valueOf(randomInt1));
        map.put("quantity", randomInt2);
        map.put("price", randomInt3);
        return map;
    }
    
}