package service;

import entities.BizStudent;
import entities.ItStudent;

import java.util.Scanner;

public class ItStudentService {
    // Hàm nhập thoong tin cho sv IT
    public ItStudent inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên cho sv IT: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập chuyên ngành của IT: ");
        String major = scanner.nextLine();
        System.out.println("Mời b nhập điểm html: ");
        double htmlScore = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm css: ");
        double cssScore = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm java: ");
        double javaScore = Double.parseDouble(scanner.nextLine());
        ItStudent itStudent = new ItStudent(name, major, javaScore, htmlScore, cssScore );
        return itStudent;
    }
}
