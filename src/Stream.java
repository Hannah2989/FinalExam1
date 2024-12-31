import java.util.Comparator;
import java.util.List;


public class Stream {

    public void listStudentsOlderThan20(List<Student> studentList){
        System.out.println("Students older than 20 years are :");
        studentList.stream().filter(student -> student.age > 20).toList()
                .forEach(Student::showDetails);
    }

    public void findCourseByInstructorId(List<Course> courseList,List<Instructor> instructorList, long instructorId){
        String thisInstructorName = instructorList.stream().filter(instructor -> instructor.id == instructorId )
                .map(instructor -> instructor.name).findFirst().orElse(null);

        if (thisInstructorName == null){
            System.out.println("Instructor not found.");
        }
        else {
            System.out.println("Courses taught by this instructor are : ");
            courseList.stream().filter(course -> course.instructorName.equals(thisInstructorName))
                    .forEach(Course::showCourseDetails);
        }
    }

    public void countStudentsInCourse(List<Course> courseList, long courseId) throws CourseNotFoundException{
       Course theCourse= courseList.stream().filter(course -> course.courseId == courseId).findFirst().orElse(null);
       try {
           if (theCourse == null){
               throw new CourseNotFoundException("Course not found.");
           }
           else {
               System.out.println("We got " + theCourse.studentCount() + " on this course.");
           }
       }
       catch (CourseNotFoundException ex){
           ex.getMessage();
       }

    }

    public void sortCourseByStudentCount(List<Course> courseList){
        System.out.println("Courses sorted by students count : ");
        courseList.stream().sorted(Comparator.comparingInt(Course::studentCount))
                .forEach(Course::showCourseDetails);
    }

    public void listDistinctCourseNames(List<Course> courseList){
        System.out.println("Distinct course names : ");
        courseList.stream().map(course -> course.courseName).distinct()
                .forEach(System.out::println);
    }

    public void coursesWithLessThan5Students(List<Course> courseList){
        System.out.println("Courses with less than 5 students : ");
        courseList.stream().filter(course -> course.studentCount()< 5)
                .forEach(Course::showCourseDetails);
    }
}
