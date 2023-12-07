package azeem.java.server.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class dataServiceImp implements dataService {

    @Autowired
    private dataRepository dataRepo;

    @Override
    public List<data> getAllData() {
        return (List<data>) dataRepo.findAll();
    }

    @Override
    public data getOneData(int students_id) {
        return dataRepo.findById(students_id).orElse(null);
    }

    @Override
    public void addNewData(data Data) {
        dataRepo.save(Data);
    }
   /* @Override
    public void updateData(int students_id, data Data) {
        if (dataRepository.existsById(students_id)) {
            Data.setStudents_ID(students_id);
            dataRepository.save(Data);
        }
    }*/
    
   

    @Override
    public void deleteData(int students_id) {
        dataRepo.deleteById(students_id);
    }

 


}