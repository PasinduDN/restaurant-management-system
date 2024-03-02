package edu.test.service.impl;

import edu.test.model.Item;
import edu.test.service.ItemService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    List<Item> itemList = new ArrayList();

    @Override
    public List<Item> getItem(){
        return itemList;
    }

    @Override
    public void addItem( Item item){
        itemList.add(item);
    }

}
