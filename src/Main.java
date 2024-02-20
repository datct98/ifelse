import entities.BizStudent;
import entities.ItStudent;
import entities.TechmasterStudent;
import service.BizStudentService;
import service.ItStudentService;
import service.TechmasterStudentService;
import utils.Constant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập số lượng sv: ");
        int n = Integer.parseInt(scanner.nextLine());
        TechmasterStudent[] techmasterStudents = new TechmasterStudent[n];
        TechmasterStudentService service = new TechmasterStudentService();
        service.saveStudentInfo(scanner, n, techmasterStudents);

    }
}
