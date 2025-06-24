import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên N bất kỳ");
        if(sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n <= 0) {
                System.err.println("Số bạn nhập vào không hợp lệ");
            } else {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.printf("Tổng các số từ 1 đến %d là %d ", n, sum);
            }
        } else {
            System.err.println("Giá trị nhập vào không hợp lệ");
        }
    }
}
