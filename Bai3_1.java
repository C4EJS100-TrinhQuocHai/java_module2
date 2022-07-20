import java.util.Scanner;
public class Bai3_1 {
    public static void main(String[] args) {
        // xóa phần tử trong mảng in ra mảng mới.
        int n, i, c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int N[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            N[i] = scanner.nextInt();
        }
        System.out.println("Nhập số nguyên k cần xóa: ");
        int k = scanner.nextInt();
        for (c = i = 0; i < n; i++) {
            if (N[i] != k) {
                N[c] = N[i];
                c++;
            }
        }
        n = c;
        // hiển thị các phần tử trong mảng sau khi xóa k
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(N[i] + "\t");
        }
    }
}
