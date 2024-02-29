package edu.test.service;

import edu.test.dto.Item;
import edu.test.entity.ItemEntity;

import java.util.Iterator;
import java.util.List;

public interface InventoryService {

    Iterable <ItemEntity> getAll();
    void  addItem(Item item);

}
