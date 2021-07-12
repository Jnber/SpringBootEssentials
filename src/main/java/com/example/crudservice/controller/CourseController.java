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

    @GetMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{idTopic}/courses/{id}")
    public Course getCourse (@PathVariable String id){
        return courseService.getCourse(id);
    }

    @PostMapping("/topics/{id}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String id){
        course.setTopic(new Topic(id, "", ""));
        courseService.addCourse(course);
    }

    @PutMapping("/topics/{id}/courses")
    public void updateCourse(@RequestBody Course course, @PathVariable String id){
        course.setTopic(new Topic(id, "", ""));
        courseService.updateCourse(course);
    }

    @DeleteMapping("/topics/{idTopic}/courses/{id}")
    public void deleteCourse (@PathVariable String id){
        courseService.deleteCourse(id);
    }

}
