package persistance.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import persistance.Model.Roles;

import java.util.List;

public interface RoleDAO extends JpaRepository {
    static List<Roles> findUserById(int id) {
        return null;
    }
}
