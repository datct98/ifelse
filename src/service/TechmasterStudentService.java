package service;

import entities.BizStudent;
import entities.ItStudent;
import entities.TechmasterStudent;
import utils.Constant;

import java.util.Scanner;

public class TechmasterStudentService {
    public void saveStudentInfo(Scanner scanner, int n, TechmasterStudent[] techmasterStudents){
        for (int i = 0; i < n; i++) {
            System.out.println("B muốn nhập thông tin cho sv biz (1) hay IT (2)? Mời bạn lựa chọn!");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case Constant.BIZ_STUDENT_INPUT:
                    BizStudentService bizStudentService = new BizStudentService();
                    BizStudent bizStudent= bizStudentService.inputInfo(scanner);
                    bizStudent.printInfo();
                    techmasterStudents[i] = bizStudent;
                    break;
                case Constant.IT_STUDENT_INPUT:
                    ItStudentService itStudentService = new ItStudentService();
                    ItStudent itStudent = itStudentService.inputInfo(scanner);
                    itStudent.printInfo();
                    techmasterStudents[i] = itStudent;
                    break;
            }
        }
    }
}
