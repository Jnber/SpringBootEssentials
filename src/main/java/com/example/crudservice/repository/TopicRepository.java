package com.example.crudservice.repository;


import com.example.crudservice.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

}
