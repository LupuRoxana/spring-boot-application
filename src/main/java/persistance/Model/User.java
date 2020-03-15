package persistance.Model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity(name = "USERS")
@Table(name = "USERS")

public class User {
    @OneToMany(mappedBy = "USERS")
    @Id
    @GeneratedValue
    private int id;

    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private ArrayList<Roles> roles = new ArrayList<>();

    public ArrayList<Roles> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Roles> roles) {
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }





}
