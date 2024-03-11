import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        do {
            System.out.println("Nhập vào ba số nguyên a, b, và c:");
            System.out.print("a = ");
            a = scanner.nextInt();
            System.out.print("b = ");
            b = scanner.nextInt();
            System.out.print("c = ");
            c = scanner.nextInt();

            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Ba số phải là số dương. Vui lòng nhập lại.");
            }
        } while (a <= 0 || b <= 0 || c <= 0);

        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Ba cạnh a, b, và c có thể tạo thành một tam giác.");

        else
            System.out.println("Không thể tạo thành một tam giác");
        scanner.close();
    }
}
