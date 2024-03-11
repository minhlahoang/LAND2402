import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương thứ nhất: ");
        int a = scanner.nextInt();

        System.out.print("Nhập vào số nguyên dương thứ hai: ");
        int b = scanner.nextInt();

        int gcd = 1;
        for (int i = 1; i <= a && i <= b; ++i) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + gcd);

        scanner.close();
    }
}
