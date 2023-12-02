package azeem.java.server.users;





import org.springframework.data.jpa.repository.JpaRepository;





public interface userRepository extends JpaRepository<Users, Long> {
	boolean existsByUsername(String username);

	Users findByUsername(String username);
    
}
