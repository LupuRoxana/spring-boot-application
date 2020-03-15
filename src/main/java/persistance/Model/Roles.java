package persistance.Model;

import javax.persistence.*;

@Entity(name = "ROLES")
@Table(name = "ROLES")
public class Roles {


    @ManyToOne
    @JoinColumn(name = "id", nullable = false)

    @Id
    @GeneratedValue
    private int id;
    private String rol_name;
    private String rol_description;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol_name() {
        return rol_name;
    }

    public void setRol_name(String rol_name) {
        this.rol_name = rol_name;
    }

    public String getRol_description() {
        return rol_description;
    }

    public void setRol_description(String rol_description) {
        this.rol_description = rol_description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
