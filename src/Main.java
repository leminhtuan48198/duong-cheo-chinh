import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập kích thước của ma trận vuông");
        int size=scanner.nextInt();
        double[][] arr=new double[size][size];
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Nhập giá trị hàng "+i+" cột "+j);
                arr[i][j]=scanner.nextDouble();


            }
        }
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]+"\t\t");
            }
            System.out.println("");
        }
        double sum=0.0;
        for (int i = 0; i < size; i++) {
           sum+=arr[i][i];
        }
        System.out.println(" tổng các số ở đường chéo chính của ma trận vuông là "+sum );
    }
}
