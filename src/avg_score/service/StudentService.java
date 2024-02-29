package avg_score.service;

import avg_score.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public Student inputStudent(Scanner scanner){
        System.out.println("mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("mời b nhập điểm toán: ");
        double math = Double.parseDouble(scanner.nextLine());
        System.out.println("mời b nhập điểm Lý: ");
        double physic = Double.parseDouble(scanner.nextLine());
        System.out.println("mời b nhập điểm Hóa: ");
        double chemistry = Double.parseDouble(scanner.nextLine());
        return  new Student(name, math, physic, chemistry);

    }

    public void classify(ArrayList<Student> students){
        double countA = 0, countB=0, countC=0;
        for (Student student: students){
            if(student.avgScore()>=8)
                countA++;
            else if(student.avgScore()>=6.5)
                countB++;
            else countC++;
        }
        System.out.println("%A: "+ countA/(countA+ countB+ countC)*100);
        System.out.println("%B: "+ countB/(countA+ countB+ countC)*100);
        System.out.println("%C: "+ countC/(countA+ countB+ countC)*100);

    }
}
