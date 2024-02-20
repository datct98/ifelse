package service;

import entities.BizStudent;

import java.util.Scanner;

public class BizStudentService {
    public BizStudent inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên cho sv biz: ");
        String nameBiz = scanner.nextLine();
        System.out.println("Mời b nhập chuyên ngành của biz: ");
        String majorBiz = scanner.nextLine();
        System.out.println("Mời b nhập điểm marketing: ");
        double maketingScore = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm sale: ");
        double saleScore = Double.parseDouble(scanner.nextLine());
        BizStudent bizStudent = new BizStudent(nameBiz, majorBiz, maketingScore,saleScore );
        return bizStudent;
    }
}
