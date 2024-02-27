package techmaster.service;

import techmaster.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {

    public Student insertStudent(Scanner scanner){
        System.out.println("Mời b nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        return  new Student(id, name);
    }

    public Student findById(int id, ArrayList<Student> students){
        for (Student st: students){
            if(st.getId() == id){
                return st;
            }
        }
        return null;
    }

    public ArrayList<Student> findByName(String name, ArrayList<Student> students){
        if(students == null){
            //System.out.println("#StudentService - findByName - students is null");
            students = new ArrayList<>();
            return null;
            // Tự xử lý
        } else {
            ArrayList<Student>  studentFounds = new ArrayList<>();
            for (Student  st: students){
                if(st.getName().equals(name)){

                    studentFounds.add(st);
                }
            }
            return studentFounds;
        }
    }

    public void updateStudentById(int id, ArrayList<Student> students, Scanner scanner){
        Student student = findById(id, students);
        if(student == null){
            System.out.println("Không tìm thấy học sinh có id là: "+ id);
        } else {
            System.out.println("mời b nhập học lực muốn thay đổi của học sinh có id là: "+id);
            String hl = scanner.nextLine();
            student.setName(hl);
        }
    }
}
