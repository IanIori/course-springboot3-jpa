package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

//JpaRepository already has methods to implement as an interfaceand inherits notation
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
