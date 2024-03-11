import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            int year;

            do {
                System.out.print("Nhập vào số năm: ");
                year = scanner.nextInt();

                if (year <= 0) {
                    System.out.println("Vui lòng nhập vào một số năm dương.");
                }
            } while (year <= 0);

            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println(year + " là năm nhuận.");
            } else {
                System.out.println(year + " không phải là năm nhuận.");
            }

            System.out.print("Bạn có muốn kiểm tra năm khác không? (Y/N): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        scanner.close();
    }
}
