package com.example.crudservice.service;

import com.example.crudservice.model.Course;
import com.example.crudservice.model.Topic;
import com.example.crudservice.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses(String topicId){
        List<Course> list = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(list :: add);
        return list;
    }

    public Course getCourse(String id){
        Course course = courseRepository.findById(id).stream().findFirst().get();
        return course;
    }

    public  void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse (Course course){
        courseRepository.save(course);
    }

    public void deleteCourse(String id){
        courseRepository.deleteById(id);
    }
}
