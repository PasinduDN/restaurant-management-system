package edu.test.service;

import edu.test.model.Item;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ItemService {
    List<Item> getItem();

    void addItem( @RequestBody Item item);
}
