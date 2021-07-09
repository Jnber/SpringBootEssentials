package com.example.crudservice.service;

import com.example.crudservice.model.Topic;
import com.example.crudservice.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    //arrays.asList is immutable
    /* List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "spring framework", "spring framework description"),
                new Topic("java", "core Java", "Java description"),
                new Topic("JavaScript", "React", "React description")
    ));*/

    public List<Topic> getAllTopics(){
        //return topics;
        List<Topic> list = new ArrayList<>();
        topicRepository.findAll().forEach(list :: add);
        return list;
    }

    public Topic getTopic(String id){
        //return topics.stream().filter(topic -> topic.getID().equals(id)).findFirst().get();
        Topic topic = topicRepository.findById(id).stream().findFirst().get();
        return topic;
    }

    public  void addTopic(Topic topic){
        //topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic (Topic ttopic){
        /*for (int i = 0; i< topics.size(); i++){
            Topic t = topics.get(i);
            if (t.getID().equals(id)){
                topics.set(i, ttopic);
            }
        }*/
        //the save does add and update
        topicRepository.save(ttopic);
    }

    public void deleteTopic(String id){
        //topics.removeIf(topic -> topic.getID().equals(id));
        topicRepository.deleteById(id);
    }
}
