import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    List<String> enrolledCourses;

    public Student(long id, String name,String email, int age, List<String> enrolledCourses) {

        super(id, name, email, age);
        this.enrolledCourses = enrolledCourses;

    }

    @Override
    void showDetails() {
        System.out.println("Student{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                "enrolledCourses=" + enrolledCourses + '\''
                +
                '}');
    }
}
