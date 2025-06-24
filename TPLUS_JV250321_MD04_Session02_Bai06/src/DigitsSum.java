import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số nguyên bất kỳ:");
            if (!sc.hasNextInt()) {
                System.out.println("Giá trị nhập không hợp lệ!");
                sc.next();
                continue;
            }

            int num = sc.nextInt();
            num = Math.abs(num);

            int digitsSum = 0;

            while(num != 0) {
                digitsSum += num%10;
                num /= 10;
            }
            System.out.printf("Tổng các chữ số của số đã nhập là: %d", digitsSum);
            break;
        } while (true);
    }
}
