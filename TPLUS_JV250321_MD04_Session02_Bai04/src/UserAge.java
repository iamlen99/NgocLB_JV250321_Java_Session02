import java.util.Scanner;

public class UserAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập tuổi người dùng");
            if (!sc.hasNextInt()) {
                System.out.println("Vui lòng nhập một số nguyên và lớn hơn 0");
                sc.next();
                continue;
            }
            int age = sc.nextInt();
            if (age <= 0) {
                System.out.println("Vui lòng nhập một số nguyên và lớn hơn 0");
                continue;
            }
            System.out.printf("Tuổi của bạn là %d\n", age);
            break;
        } while (true);
    }
}
