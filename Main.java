import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a,b,c;
        System.out.println("Phương trình bậc 2: ax^2+bx+c=0");
        System.out.println("Nhập giá trị của a");
        Scanner sc = new Scanner(System.in);
        a=sc.nextDouble();

        System.out.println("Nhập giá trị b ");
        b=sc.nextDouble();

        System.out.println("Nhập giá trị c ");
        c=sc.nextDouble();
        QuadraticEquation phuongTrinh = new QuadraticEquation(a, b, c);
        if(phuongTrinh.getDiscriminant()<0) System.out.println("Phương trình vô nghiệm ");
        else if(phuongTrinh.getDiscriminant()==0) System.out.println("Phương trình có 1 nghiệm duy nhất: "+phuongTrinh.getRoot1());
        else{
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.println(": "+phuongTrinh.getDiscriminant());
            System.out.println("Root1 is: "+phuongTrinh.getRoot1());
            System.out.println("Root2 is: "+phuongTrinh.getRoot2());
        }
    }
}
