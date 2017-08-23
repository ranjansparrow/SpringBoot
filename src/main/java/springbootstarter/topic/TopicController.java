package springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ranjan on 8/22/17.
 */
@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopic(){
        return Arrays.asList(
            new Topic("Spring", "Spring Framework" ,"Spring Description"),
            new Topic("Java", "Core Java" ,"This is Core Java"),
            new Topic("Hibernate", "Hibernate Framework" ,"Hibernate Description")



        );
    }
}
