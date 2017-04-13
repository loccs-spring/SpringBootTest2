package cn.edu.sjtu.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by spring on 2017/4/13.
 */

@Service
public class TopicService {


    private List<Topic> topics = new ArrayList(Arrays.asList(
            new Topic("spring","Spring Framework","Spring Framework Description"),
            new Topic("java","Core Java","Core Java Description"),
            new Topic("javascript","Javascript","Javascript Description"))
    );


    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
