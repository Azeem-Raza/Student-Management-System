package azeem.java.server.data;

public class DataNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DataNotFoundException(int students_id) {
		super("Data  Not Found where student ID is "+ students_id);
	}

}
