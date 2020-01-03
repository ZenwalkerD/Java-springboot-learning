package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Person;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepo extends JpaRepository<Person, Integer> {

}
