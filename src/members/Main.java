package members;

import members.entities.Member;
import members.service.MemberService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<>();
        System.out.println("Mời b nhập số lượng thành viên: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho thành viên thứ: "+(i+1));
            Member member = memberService.inputInfo(scanner);
            members.add(member);
        }

        System.out.println(members);
    }
}
