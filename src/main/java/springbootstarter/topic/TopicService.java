package springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ranjan on 8/23/17.
 */
@Service
public class TopicService {





    private List<Topic> topics = new ArrayList<>( Arrays.asList(
            new Topic("Spring", "Spring Framework" ,"Spring Description"),
            new Topic("Java", "Core Java" ,"This is Core Java"),
            new Topic("Hibernate", "Hibernate Framework" ,"Hibernate Description")
    ));



    @Autowired
    TopicRepository topicRepository;

    public List<Topic> getTopics(){
        return (List<Topic>) topicRepository.findAll();
    }

    public Topic getTopic(String id){
        return topicRepository.findOne(id);
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic (Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic (String id , Topic topic){
        /*for (int i = 0 ; i<topics.size();i++){
            Topic topic1 = topics.get(i);
            if (id.equals(topic1.getId())){
                topics.set(i,topic);
                return;
            }
        }*/
        topicRepository.save(topic);
    }

    public void deleteTopic (String id , Topic topic){
        /*for (int i = 0; i<topics.size();i++){
            Topic t = topics.get(i);
            if (id.equals(t.getId())){
                topics.remove(t);
                return;
            }
        }*/
        topicRepository.delete(id);
    }
}
