import java.util.Scanner;

public class Bai3_3 {
    public static void main(String[] args) {
        // Gộp 2 mảng.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng 1: ");
        int sLMang1=scanner.nextInt();
        int [] mang1=new int[sLMang1];
        for(int i =0; i<sLMang1;i++){
            System.out.println("Nhập giá trị mảng 1 [index: "+i+" ] ");
            int giaTri=scanner.nextInt();
            mang1[i]=giaTri;
        }
        System.out.println("Nhập số lượng phần tử mảng 2: ");
        int sLMang2=scanner.nextInt();
        int [] mang2=new int[sLMang2];
        for(int i =0; i<sLMang2;i++){
            System.out.println("Nhập giá trị mảng 2 [index: "+i+" ] ");
            int giaTri=scanner.nextInt();
            mang2[i]=giaTri;
        }
        int [] mang1GopMang2 = new int[sLMang1+sLMang2];
        for(int i =0;i<sLMang1;i++){
            mang1GopMang2[i]=mang1[i];
        }
        for(int i=sLMang1;i<sLMang1+sLMang2;i++){
            mang1GopMang2[i]=mang2[i-sLMang1];
        }
        for (int i =0;i<mang1GopMang2.length;i++){
            System.out.println(mang1GopMang2[i]);
        }
    }
}