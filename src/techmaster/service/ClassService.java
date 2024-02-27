package techmaster.service;

import techmaster.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassService {
    public void insertStudentIntoClass(ArrayList<Student> students, Scanner scanner){
        StudentService service = new StudentService();
        Student student = service.insertStudent(scanner);
        if(students!= null)
            students.add(student);
        else {
            //System.out.println("Danh sách student không tồn tại để thêm mới");
            students = new ArrayList<>();
            students.add(student);
        }
    }
}
