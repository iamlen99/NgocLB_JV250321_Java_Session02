import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số độ dài cạnh thứ nhất:");
        int a = input.nextInt();
        System.out.println("Nhập số độ dài cạnh thứ hai:");
        int b = input.nextInt();
        System.out.println("Nhập số độ dài cạnh thứ ba:");
        int c = input.nextInt();
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều");
            } else if (a == b || a == c || b == c) {
                System.out.println("Đây là tam giác cân");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Đây là tam giác vuông");
            } else {
                System.out.println("Đây là tam giác thường");
            }

        } else {
            System.out.println("Ba cạnh không tạo thành tam giác");
        }
    }
}
