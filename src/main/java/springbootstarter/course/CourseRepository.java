package springbootstarter.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springbootstarter.topic.Topic;

import java.util.List;


/**
 * Created by ranjan on 8/23/17.
 */
@Repository
public interface CourseRepository extends CrudRepository<Course,String> {


    public List<Course> findByTopicId(String topicId);
}
