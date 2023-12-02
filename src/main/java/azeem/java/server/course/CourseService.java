package azeem.java.server.course;

import java.util.List;

public interface CourseService {
    List<course> getAllCourse();
    //List<data> getStudentsEnrolledInCourse(Long courseId);
    course getOneCourse(int course_id);
    void addNewCourse(course Course);
    void updateCourse(int course_id, course Course);
    void deleteCourse(int course_id);
}