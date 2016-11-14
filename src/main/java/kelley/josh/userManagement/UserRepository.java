package kelley.josh.userManagement;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by joshuakelley on 11/3/16.
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
