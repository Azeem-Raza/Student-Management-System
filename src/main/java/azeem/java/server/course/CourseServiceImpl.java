package azeem.java.server.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private courseRepo courseRepository;

    @Override
    public List<course> getAllCourse(){
		return (List<course>) courseRepository.findAll();
		
	}
    

    @Override
    public course getOneCourse(int course_id) {
        return courseRepository.findById(course_id).orElse(null);
    }

    @Override
    public void addNewCourse(course Course) {
        courseRepository.save(Course);
    }

    @Override
    public void updateCourse(int course_id, course Course) {
        if (courseRepository.existsById(course_id)) {
            Course.setCourse_id(course_id);
            courseRepository.save(Course);
        }
    }
    

    @Override
    public void deleteCourse(int course_id) {
        courseRepository.deleteById(course_id);
    }


	


	

}