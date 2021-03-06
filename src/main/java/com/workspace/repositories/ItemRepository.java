package com.workspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workspace.Entity.Items;

@Repository
public interface ItemRepository extends JpaRepository <Items, Long> {

}
