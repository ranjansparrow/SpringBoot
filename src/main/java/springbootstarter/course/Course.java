package springbootstarter.course;

import springbootstarter.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by ranjan on 8/23/17.
 */
@Entity
public class Course {
    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    Topic topic;

    public Course(String id, String name, String description, String topicId ) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"","");
    }

    public Course() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}

