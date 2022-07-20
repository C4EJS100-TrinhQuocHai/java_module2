import java.util.Scanner;

public class Bai1_3 {
    public static void main(String[] args) {
        //1.3 Ứng dụng đọc số thành chữ.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập giá trị trong khoảng: 0 den 999");
        int number=scanner.nextInt();
        while (number<0||number>999){
            System.out.println("Nhập lại giá trị phù hợp: ");
            number= scanner.nextInt();
        }
        if(number<10){
            System.out.println(motChuSo(number));
            return;
        }
        else if(number<=99){
            System.out.println(haiChuSo(number));
            return;
        }
        else{
            System.out.println(baChuSo(number));
            return;
        }
    }
    public static String motChuSo(int number) {
        switch (number) {
            case 0:
                return "";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return "can't read this";
    }

    public static String haiChuSo(int number){
        if(number<20){
            switch (number){
                case 10:
                    return "ten";
                case 11:
                    return "eleven";
                case 12:
                    return "two";
                case 13:
                    return "thirteen";
            }
            return motChuSo(number%10) + "teen";
        }
        else if(number<=99){
            switch (number/10){
                case 2:
                    return "twenty" +" " +motChuSo(number%10);
                case 3:
                    return "thirty" +" " +motChuSo(number%10);
                case 4:
                    return "forty" +" " +motChuSo(number%10);
                case 5:
                    return "fifty" +" " +motChuSo(number%10);
                case 6:
                    return "sixty" +" " +motChuSo(number%10);
                case 7:
                    return "seventy" +" " +motChuSo(number%10);
                case 8:
                    return "eighty" +" " +motChuSo(number%10);
                case 9:
                    return "ninety" +" " +motChuSo(number%10);

            }
        }

        return "";

    }

    public static String baChuSo(int number){
        return motChuSo(number/100)+ " "+"hundred" +" "+haiChuSo(number%100);

    }
}