import java.util.List;

public class Instructor extends Person{

    List<String> teachingCourses;

    public Instructor(long id, String name, String email, int age, List<String> teachingCourses) {
        super(id, name, email, age);
        this.teachingCourses = teachingCourses;
    }

    @Override
    void showDetails() {
        System.out.println("Instructor{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                "teachingCourses=" + teachingCourses + '\'' +
                '}');
    }
}
