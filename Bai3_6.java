import java.util.Scanner;

public class Bai3_6 {
    public static void main(String[] args) {
        //    Tính tổng các số ở một cột xác định.
        int n;  // bậc của ma trận vuông
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bậc của ma trận: ");
        n = scanner.nextInt();
        int A[][] = new int[n][n];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
