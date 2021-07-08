package com.example.crudservice.controller;

import com.example.crudservice.model.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("spring", "spring framework", "spring framework description"),
                new Topic("java", "core Java", "Java description"),
                new Topic("JavaScript", "React", "React description")
        );
    }
}
