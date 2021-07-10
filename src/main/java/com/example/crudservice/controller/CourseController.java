package com.example.crudservice.controller;

import com.example.crudservice.model.Course;
import com.example.crudservice.model.Topic;
import com.example.crudservice.service.CourseService;
import com.example.crudservice.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic (@PathVariable String id){
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @PutMapping("/topics")
    public void updateTopic(@RequestBody Topic topic){
        topicService.updateTopic(topic);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic (@PathVariable String id){
        topicService.deleteTopic(id);
    }

}
