package azeem.java.server.course;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RequestMapping("/SMS/courses")
@RestController
public class courseController {
	private final courseRepo repository;
	private CourseService courseService;
	
	public courseController(courseRepo c) {
		this.repository = c;
	}
	//get all data
		//Url /data to access data
		@GetMapping("/all")
		List<course> getAllCourse(){
			return (List<course>) repository.findAll();
			
		}
		//Get one course by Id if ID not found return no course found 404
		@GetMapping("/{course_id}")
		course getOneCourse(@PathVariable int course_id) {
			return repository.findById(course_id).orElseThrow(
					() -> new CourseNotFoundException(course_id)
					
			); 
		}
		
		//add New course 
		
		@PostMapping
		course addNewCourse(@RequestBody course Course) {
			return repository.save(Course);
			
		}
		
		@PutMapping("course/{course_id}")
		public void updateCourse(@PathVariable int course_id, @RequestBody course Course) {
	        courseService.updateCourse(course_id, Course);
	        
		}
		//delete student
		@DeleteMapping("/course/{course_id}")
		void deleteCourse(@PathVariable int course_id) {
			repository.deleteById(course_id);
		}
	
	
}






	
	
	