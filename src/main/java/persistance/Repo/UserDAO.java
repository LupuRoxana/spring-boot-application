package persistance.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import persistance.Model.User;

public interface UserDAO extends JpaRepository {
    User findByUser(int id);

}
