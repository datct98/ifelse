package members.service;

import members.entities.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MemberService {
    public Member inputInfo(Scanner scanner){
        System.out.println("Mời b nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời b nhập Tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập DOB (yyyy/MM/dd): ");
        String dobString = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dobString, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        Member member = new Member(id, name, dob);
        return member;
    }
}
