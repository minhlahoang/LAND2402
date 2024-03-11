import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();
        int gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        System.out.println("Giai thừa của " + n + " là: " + gt);

        scanner.close();
    }
}
