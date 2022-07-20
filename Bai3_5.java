public class Bai3_5 {
    public static void main(String[] args) {
        // Tìm giá trị nhỏ nhất trong mảng.
        int[] arrValues = {15,59,24,88,9,94};
        int min = arrValues[0];
        for(int i=0;i<arrValues.length;i++) {
            for(int j=i+1;j<arrValues.length;j++) {
                if(arrValues[i] > arrValues[j]) {
                    min = arrValues[i];
                    arrValues[i] = arrValues[j];
                    arrValues[j] = min;
                }
            }
        }
        System.out.println("Số nhỏ nhất là: " + arrValues[0]);
    }
}
