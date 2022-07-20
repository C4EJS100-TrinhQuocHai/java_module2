import java.util.Scanner;

public class Bai3_2 {
    public static void main(String[] args) {
        // Thêm phần tử vào mảng.
        int []mangSo={1,5,6,7};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vị trí bạn muốn thêm vào :");
        int index=scanner.nextInt();
        if(index<0 || index>mangSo.length){
            System.out.println("Không thể chèn vào vị trị bạn mong muốn!");
            return;
        }
        System.out.println("Nhập giá trị phần tử cần chèn");
        int giaTri =scanner.nextInt();
        mangSo=themMotPhanTu(mangSo,index,giaTri);
        for(int i=0;i<mangSo.length;i++){
            System.out.println(mangSo[i]);
        }
    }
    public static int[] themMotPhanTu(int[] mangSo, int index,int value){
        int[] daySoMoi=new int[mangSo.length+1];
        for(int i =0;i<index;i++){
            daySoMoi[i]=mangSo[i];
        }
        for(int i=index;i<mangSo.length+1;i++){
            if(i==index){
                daySoMoi[i]=value;
            }
            else{
                daySoMoi[i]=mangSo[i-1];
            }
        }
        return daySoMoi;
    }




}