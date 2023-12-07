package azeem.java.server.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    private final userRepository userRepo;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public userServiceImpl(userRepository userRepo, BCryptPasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void addNewUser(Users user) {
        // Hash the user's password before saving
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        userRepo.save(user);

        System.out.println("User saved with hashed password: " + hashedPassword);
    }

}
