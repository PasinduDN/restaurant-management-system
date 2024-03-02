package edu.test.repository;

import edu.test.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository <ItemEntity,Long> {
}
