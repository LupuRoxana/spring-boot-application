package persistance.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import persistance.Model.Roles;
import persistance.Repo.RoleDAO;
import persistance.Repo.UserDAO;

import java.util.List;

public class UserService {
    @Autowired
    private RoleDAO roleDAO;

    @Autowired
    private persistance.Repo.UserDAO UserDAO;

    @GetMapping("/users/{id}/roles")
    public List<Roles> getAllAddressById(@PathVariable(value = "id") int id) {
        return RoleDAO.findUserById(id);
    }
}
