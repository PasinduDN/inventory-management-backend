package edu.test.service;

import edu.test.dto.Item;
import edu.test.entity.ItemEntity;
import edu.test.repository.Inventoryrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventorySErviceImpl implements InventoryService{

    @Autowired
    Inventoryrepository repository;

//    List <Item> itemList = new ArrayList<>();
//    @Override
//    public List<Item> getAll() {
//        itemList.add(new Item("Laptop",75000));
//        itemList.add(new Item("Tablet",65000));
//        return itemList;
//    }

    @Override
    public Iterable<ItemEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public void addItem(Item item) {
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setName(item.getName());
        itemEntity.setPrice(item.getPrice());

        repository.save(itemEntity);
    }
}
