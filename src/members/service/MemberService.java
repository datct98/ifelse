package members.service;

import members.entities.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
        return new Member(id, name, dob);
    }

    public void saveMembers(Scanner scanner, ArrayList<Member> members){
        System.out.println("Mời b nhập số lượng thành viên: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho thành viên thứ: "+(i+1));
            Member member = inputInfo(scanner);
            members.add(member);
        }
        System.out.println(members);
    }
}
