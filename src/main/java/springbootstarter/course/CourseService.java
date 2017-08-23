package springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import springbootstarter.topic.Topic;
import springbootstarter.topic.TopicRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ranjan on 8/23/17.
 */
@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getCourses(@PathVariable String id){
        return courseRepository.findByTopicId(id);
    }

    public Course getCourse(String id){
        return courseRepository.findOne(id);

    }

    public void addCourse (Course course){
        courseRepository.save(course);
    }

    public void updateCourse (Course course){
        courseRepository.save(course);
    }

    public void deleteCourse (String id , Course course){
        courseRepository.delete(id);
    }
}
