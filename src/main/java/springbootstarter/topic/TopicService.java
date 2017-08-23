package springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ranjan on 8/23/17.
 */
@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("Spring", "Spring Framework" ,"Spring Description"),
            new Topic("Java", "Core Java" ,"This is Core Java"),
            new Topic("Hibernate", "Hibernate Framework" ,"Hibernate Description")
    );




    public List<Topic> getTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}
