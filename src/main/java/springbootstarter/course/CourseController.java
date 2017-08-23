package springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springbootstarter.topic.Topic;
import springbootstarter.topic.TopicService;

import java.util.List;

/**
 * Created by ranjan on 8/22/17.
 */
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllTopic(@PathVariable String id){
        return courseService.getCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course,@PathVariable String topicId){
        course.setTopic(new Topic(topicId , "",""));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id,@PathVariable String topicId){
        course.setTopic(new Topic(topicId , "",""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
    public void deleteCourse(@RequestBody Course course, @PathVariable String id){

        courseService.deleteCourse(id,course);
    }


}
