package azeem.java.server.data;

import java.util.List;

public interface dataService {
	List<data> getAllData();
    data getOneData(int students_id);
    void addNewData(data Data);
   // void updateData(int students_id, data Data);
    void deleteData(int students_id);
	


}
