import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        int year;

        System.out.print("Nhập vào số tháng: ");
        month = scanner.nextInt();

        do {
            System.out.print("Nhập vào năm: ");
            year = scanner.nextInt();

            if (year <= 0) {
                System.out.println("Vui lòng nhập vào một năm dương.");
            }
        } while (year <= 0);

        int daysInMonth = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                daysInMonth = 31;
                break;
            case 4, 6, 9, 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Số tháng không hợp lệ.");
                break;
        }

        if (daysInMonth != 0) {
            System.out.println("Tháng " + month + " năm " + year + " có " + daysInMonth + " ngày.");
        }

        scanner.close();
    }
}
