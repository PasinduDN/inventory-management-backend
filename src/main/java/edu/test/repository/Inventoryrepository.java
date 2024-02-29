package edu.test.repository;

import edu.test.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface Inventoryrepository extends CrudRepository <ItemEntity,Long>{
}
