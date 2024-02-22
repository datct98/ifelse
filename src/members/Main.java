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

        memberService.saveMembers(scanner, members);
    }
}
