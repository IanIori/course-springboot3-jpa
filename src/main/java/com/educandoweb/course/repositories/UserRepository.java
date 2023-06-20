package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

// JpaRepository já possui métodos para implementar como interface e herda anotação de repositório
public interface UserRepository extends JpaRepository<User, Long> {

}
