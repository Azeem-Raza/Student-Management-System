package azeem.java.server.users;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class userServiceImpl implements userService {

    @Autowired
    private userRepository userRepo;

    

   

    @Override
    public void addNewUser(Users user) {
        userRepo.save(user);
    }
}