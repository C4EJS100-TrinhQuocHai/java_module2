import java.util.Scanner;


public class Bai2_2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Hiển thị các số nguyên tố nhỏ hơn 1 số cho trước!
        System.out.print("Nhập số muốn kiểm tra n = ");
        int n = scanner.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        //số nguyên n<2 không phải là số nguyên tố.
        if (n < 2) {
            return false;
        }
        // kiểm tra số nguyên tố khi n>=2.
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}