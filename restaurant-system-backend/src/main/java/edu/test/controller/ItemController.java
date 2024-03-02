package edu.test.controller;

import edu.test.model.Item;
import edu.test.service.ItemService;
import edu.test.service.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/get-Item")
    public List<Item> getItem(){
        return itemService.getItem();
    }

    @PostMapping("/add-Item")
    public void addItem( @RequestBody  Item item){
        itemService.addItem(item);
    }

}
