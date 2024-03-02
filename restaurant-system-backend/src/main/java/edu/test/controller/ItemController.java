package edu.test.controller;

import edu.test.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @GetMapping
    public Item getItem(){
        return new Item("C001","Basmathi Chicken Full Rice","Fride Rice",800);
    }
}
