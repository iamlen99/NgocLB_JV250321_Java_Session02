import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên bất kỳ:");
        if (input.hasNextInt()) {
            int n = input.nextInt();
            if (n == 0) {
                System.out.println("Số bạn nhập không phải chẵn cũng không phải lẻ");
            } else if (n % 2 == 0) {
                System.out.println("Số bạn nhập là số chẵn");
            } else {
                System.out.println("Số bạn nhập là số lẻ");
            }
        } else {
            System.out.println("Giá trị bạn nhập không phải là số!");
        }
    }
}
