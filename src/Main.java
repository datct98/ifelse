
import java.util.Scanner;

public class Main {
    //DDaay là hàm main nó dùng để ...
    public static void main(String[] args) {
        // Yêu cầu người dùng nhập tên của họ vào -> hệ thống sẽ hiển thị tên của họ
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập một số điểm: ");
        float x = Float.parseFloat(scanner.nextLine());
        if(x >=8){
            System.out.println("HSG");
        } else if(x<8 && x>=6.5){
            System.out.println("HSK");
        } else
            System.out.println("TB");
    }
}
