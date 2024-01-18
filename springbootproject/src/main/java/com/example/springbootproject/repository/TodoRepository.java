package com.example.springbootproject.repository;

import com.example.springbootproject.model.TodoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends MongoRepository<TodoDTO, String> {
}
