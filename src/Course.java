import java.util.ArrayList;
import java.util.List;

public class Course {

    long courseId;
    String courseName;
    String instructorName;
    List<Student> studentEnrolled = new ArrayList<>();

    public Course(long courseId, String courseName, String instructorName, List<Student> studentEnrolled) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.studentEnrolled = studentEnrolled;
    }

    void addStudent(Student student) {
        studentEnrolled.add(student);
    }

    void removeStudent(Student student) {
        studentEnrolled.remove(student);
    }

    void showCourseDetails(){
        System.out.println("Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", instructorName='" + instructorName + '\'' +
                ", studentEnrolled=" + studentEnrolled +
                '}');
    }
}
