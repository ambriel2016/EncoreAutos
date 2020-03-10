package com.example.encoreautos.demo.main;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    ArrayList<Category> findByCategoryName(String search);
}