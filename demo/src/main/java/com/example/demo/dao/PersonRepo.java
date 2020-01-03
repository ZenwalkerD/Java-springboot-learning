package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.PersonEntity;

public interface PersonRepo extends CrudRepository<PersonEntity, Integer> {

}
