import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Nhập số nguyên dương bất kỳ");
            if (!sc.hasNextInt()) {
                System.out.println("Giá trị nhập không hợp lệ!");
                sc.next();
                continue;
            }
            String armstrongNumbersSequence = "";
            int n = sc.nextInt();


            if (n <= 0) {
                System.out.println("Số nhập vào không hợp lệ!");
            } else {
                for (int i = 1; i <= n; i++) {
                    int k = 0;
                    int kthPowersSum = 0;
                    int temp1 = i;

                    while (temp1 != 0) {
                        k++;
                        temp1 /= 10;
                    }

                    int temp2 = i;
                    for (int j = 1; j <= k; j++) {
                        kthPowersSum += Math.pow((temp2 % 10), k);
                        temp2 /= 10;
                    }
                    if (kthPowersSum == i) {
                        armstrongNumbersSequence += i + " ";
                    }
                }
            }
            System.out.println(armstrongNumbersSequence);
        }
    }
}
