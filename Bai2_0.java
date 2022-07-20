import java.util.Scanner;

public class Bai2_0 {
    public static void main(String[] args) {
        //  In hình chữ nhật.
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều rộng hình chữ nhật: ");
        int width = scanner.nextInt();
        System.out.println("nhập chiều cao hình chữ nhật: ");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // In hình tam giác vuông, có cạnh góc vuông ở botton-left
        int hight1;
        System.out.printf("Nhập vào chiều cao của tam giác: ");
        hight1 = scanner.nextInt();
        for (int i = 1; i <= hight1; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        // In hình tam giác vuông, có cạnh góc vuông ở top-left
        int hight2;
        System.out.printf("Nhập vào chiều cao của tam giác: ");
        hight2 = scanner.nextInt();
        for (int i = hight2; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}
