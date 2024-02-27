package techmaster;

import techmaster.entities.Student;
import techmaster.service.StudentService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        List<Student> students = studentService.findByName("dat", null);
        if(students!= null && students.size()>0){
            //TODO
        }
    }
}
