import java.util.Scanner;

public class DatesOfMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số nguyên tương ứng với tháng:");
            if (!sc.hasNextInt()) {
                System.out.println("Dữ liệu nhập vào không hợp lệ!");
                sc.next();
                continue;
            }
            int month = sc.nextInt();
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.printf("Tháng %d có 31 ngày\n", month);
                    System.exit(0);
                    break;
                case 2:
                    System.out.printf("Tháng %d có 28 hoặc 29 ngày\n", month);
                    System.exit(0);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.printf("Tháng %d có 30 ngày\n", month);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tháng không hợp lệ!");
            }
        } while (true);

    }
}
