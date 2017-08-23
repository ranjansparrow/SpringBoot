package springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by ranjan on 8/23/17.
 */
@Repository
public interface TopicRepository extends CrudRepository<Topic,String> {
}
