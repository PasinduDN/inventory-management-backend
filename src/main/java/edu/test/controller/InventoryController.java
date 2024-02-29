package edu.test.controller;

import edu.test.dto.Item;
import edu.test.entity.ItemEntity;
import edu.test.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class  InventoryController {

    @Autowired
    InventoryService service;

    @GetMapping ("/get-items")
    public  Iterable<ItemEntity> gettAll(){
        return service.getAll();
    }

    @PostMapping
    public void addItem(@RequestBody Item item){
        service.addItem(item);
    }
}
