package edu.test.service.impl;

import edu.test.entity.ItemEntity;
import edu.test.model.Item;
import edu.test.repository.ItemRepository;
import edu.test.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository repository;

    @Override
    public List<ItemEntity> getItem(){
        return repository.findAll();
    }

    @Override
    public void addItem( Item item){

        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setItemCode(item.getItemCode());
        itemEntity.setItemName(item.getItemName());
        itemEntity.setItemCategory(item.getItemCategory());
        itemEntity.setPrice(item.getPrice());

        repository.save(itemEntity);
    }

}
