package com.theKoftaTown.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theKoftaTown.model.SelectedItemModel;

public interface SelectectedItemRepository extends JpaRepository<SelectedItemModel, Long>{

}
