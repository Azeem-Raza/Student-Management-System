package azeem.java.server;

//AuthProvider.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import azeem.java.server.users.Users;
import azeem.java.server.users.userRepository;

import java.util.Arrays;

@Component
public class AuthProvider implements AuthenticationProvider {

 private final userRepository userRepo;

 @Autowired
 public AuthProvider(userRepository userRepo) {
     this.userRepo = userRepo;
 }

 @Override
 public Authentication authenticate(Authentication authentication) throws AuthenticationException {
     String username = authentication.getName();
     String password = authentication.getCredentials().toString();

     Users user = userRepo.findByUsername(username);

     if (user != null && password.equals(user.getPassword())) {
         System.out.println("successful");
         return new UsernamePasswordAuthenticationToken(username, password, Arrays.asList());
     } else {
         System.out.println("after invalid (in AuthProvider.java) and password is: " + password);
         throw new BadCredentialsException("Invalid username or password");
     }
 }

 @Override
 public boolean supports(Class<?> authentication) {
     return authentication.equals(UsernamePasswordAuthenticationToken.class);
 }
}
