package azeem.java.server.course;

public class CourseNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public CourseNotFoundException(int course_id) {
		super("course  Not Found where course ID is "+ course_id);
	}

}
