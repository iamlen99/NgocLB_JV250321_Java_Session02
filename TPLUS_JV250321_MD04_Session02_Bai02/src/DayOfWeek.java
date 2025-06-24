import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên từ 1 đến 7");
        String notify;
        if(sc.hasNextInt()) {
            switch(sc.nextInt()) {
                case 1:
                    notify = "Chủ nhật";
                    break;
                case 2:
                    notify = "Thứ hai";
                    break;
                case 3:
                    notify = "Thứ ba";
                    break;
                case 4:
                    notify = "Thứ tư";
                    break;
                case 5:
                    notify = "Thứ năm";
                    break;
                case 6:
                    notify = "Thứ sáu";
                    break;
                case 7:
                    notify = "Thứ bảy";
                    break;
                default:
                    notify = "Số bạn nhập phải từ 1 đến 7!";
            }
        }
        else {
            notify = "Giá trị bạn nhập không hợp lệ!";
        }
        System.out.println(notify);
    }
}
