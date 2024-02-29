package avg_score;


import avg_score.entities.Student;
import avg_score.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Student student = studentService.inputStudent(scanner);
            students.add(student);
            System.out.println("===========================================");
            System.out.println(student);
        }
        System.out.println("% mỗi loại học sinh: ");
        studentService.classify(students);


    }
}
