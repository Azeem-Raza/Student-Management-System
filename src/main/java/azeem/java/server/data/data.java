package azeem.java.server.data;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "students")

public class data {
	@Id
	private int students_id; 
	private String firstname;
	private String lastname;
	
	public data() {}
	
	public data(int inputId, String inputFirstname, String inputLastname) {
		students_id = inputId;
		firstname = inputFirstname;
		lastname = inputLastname;
		
		 
	}
	 
	
	public int getstudents_id() {
		return students_id;
	}
	public void setStudents_ID(int students_ID) {
		students_id = students_ID;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
