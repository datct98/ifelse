import entities.BizStudent;
import entities.ItStudent;
import service.BizStudentService;
import service.ItStudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        BizStudentService bizStudentService = new BizStudentService();
        BizStudent bizStudent= bizStudentService.inputInfo(scanner);
        bizStudent.printInfo();
        //
        ItStudentService itStudentService = new ItStudentService();
        ItStudent itStudent = itStudentService.inputInfo(scanner);
        itStudent.printInfo();
    }
}
