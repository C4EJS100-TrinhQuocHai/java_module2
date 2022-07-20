import java.util.Scanner;

public class Bai1_2 {
    public static void main(String[] args) {
        // 1.2 Ứng dụng chuyển đổi tiền tệ.
        int monney_vnd=23000;
        int money_usd;
        System.out.println("Mời nhập số tiền USD ");
        Scanner scanner1 = new Scanner(System.in);
        int monney= scanner1.nextInt();
        System.out.println(" Kết quả quy đổi USD sang VND là : " +monney*monney_vnd);
    }
}


