import java.util.Scanner;

public class Bai1_1 {
    public static void main(String[] args) {
        // 1.1 hiển thị lời chào!
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hello: " + name);
        // 1.2 Ứng dụng chuyển đổi tiền tệ.
        int monney_vnd=23000;
        int money_usd;
        System.out.println("Mời nhập số tiền USD ");
        Scanner scanner1 = new Scanner(System.in);
        int monney= scanner1.nextInt();
        System.out.println(" Kết quả quy đổi USD sang VND là : " +monney*monney_vnd);
        // 1.3 Ứng dụng đọc số thành chữ.

    }
}

