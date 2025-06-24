import java.util.Scanner;

public class ThreeDigitNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập một số có 3 chữ số:");
            if (!sc.hasNextInt()) {
                System.out.println("Giá trị nhập vào không hợp lệ");
                sc.nextLine();
                continue;
            }

            int n = sc.nextInt();
            if (n < 100 || n > 999) {
                System.out.println("Số nhập vào không hợp lệ");
            } else {
                int hundreds = n / 100;
                String hundredsPronounce = "";
                switch (hundreds) {
                    case 1:
                        hundredsPronounce = "Một trăm";
                        break;
                    case 2:
                        hundredsPronounce = "Hai trăm";
                        break;
                    case 3:
                        hundredsPronounce = "Ba trăm";
                        break;
                    case 4:
                        hundredsPronounce = "Bốn trăm";
                        break;
                    case 5:
                        hundredsPronounce = "Năm trăm";
                        break;
                    case 6:
                        hundredsPronounce = "Sáu trăm";
                        break;
                    case 7:
                        hundredsPronounce = "Bảy trăm";
                        break;
                    case 8:
                        hundredsPronounce = "Tám trăm";
                        break;
                    case 9:
                        hundredsPronounce = "Chín trăm";
                        break;
                }

                int tens = (n / 10) % 10;
                String tensPronounce = "";
                switch (tens) {
                    case 0:
                        tensPronounce = "lẻ";
                        break;
                    case 1:
                        tensPronounce = "mười";
                        break;
                    case 2:
                        tensPronounce = "hai mươi";
                        break;
                    case 3:
                        tensPronounce = "ba mươi";
                        break;
                    case 4:
                        tensPronounce = "bốn mươi";
                        break;
                    case 5:
                        tensPronounce = "năm mươi";
                        break;
                    case 6:
                        tensPronounce = "sáu mươi";
                        break;
                    case 7:
                        tensPronounce = "bảy mươi";
                        break;
                    case 8:
                        tensPronounce = "tám mươi";
                        break;
                    case 9:
                        tensPronounce = "chín mươi";
                        break;
                }

                int units = n % 10;
                String unitsPronounce = "";
                switch (units) {
                    case 1:
                        unitsPronounce = tens <= 1 ? "một" : "mốt";
                        break;
                    case 2:
                        unitsPronounce = "hai";
                        break;
                    case 3:
                        unitsPronounce = "ba";
                        break;
                    case 4:
                        unitsPronounce = "bốn";
                        break;
                    case 5:
                        unitsPronounce = tens == 0 ? "năm" : "lăm";
                        break;
                    case 6:
                        unitsPronounce = "sáu";
                        break;
                    case 7:
                        unitsPronounce = "bảy";
                        break;
                    case 8:
                        unitsPronounce = "tám";
                        break;
                    case 9:
                        unitsPronounce = "chín";
                        break;
                }
                if (n % 100 == 0) {
                    System.out.printf("%s\n", hundredsPronounce);

                } else {
                    System.out.printf("%s %s %s\n", hundredsPronounce, tensPronounce, unitsPronounce);
                }
            }
        }
    }
}
