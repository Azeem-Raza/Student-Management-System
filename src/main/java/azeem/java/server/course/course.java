package azeem.java.server.course;



import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
@EntityScan

public class course {
	@Id
	private int course_id; 
	private String course_name;
	private String course_teacher;
	
	
public course() {}
	
	public course(int inputCourseId, String inputCoursename, String inputCourseTeacher) {
		course_id = inputCourseId;
		course_name = inputCoursename;
		course_teacher = inputCourseTeacher;
		
		 
	}
	
	
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_teacher() {
		return course_teacher;
	}
	public void setCourse_teacher(String course_teacher) {
		this.course_teacher = course_teacher;
	}
	

	
	
	
	

}




	
	
	
