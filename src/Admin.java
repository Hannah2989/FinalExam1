import java.util.ArrayList;
import java.util.List;

public class Admin extends Person{

    List<String> permissions = new ArrayList<>();

    public Admin(long id, String name, String email, int age, List<String> permissions) {
        super(id, name, email, age);
        this.permissions = permissions;
    }

    @Override
    void showDetails() {
        System.out.println("Admin{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                "permissions=" + permissions + '\'' +
                '}');
    }
}
