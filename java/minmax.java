import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {

            int  n;
            Scanner scanner= new Scanner(System.in);
            System.out.println("Nhập vào bậc của ma trận: ");
            n=scanner.nextInt();
            int a[][]  = new  int[n][n];
            System.out.println("nhập phần tử :");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("a[" + i + "]["+ j + "] = ");
                    a[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Ma trận a vừa nhập:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println("\n");
            }
            int  max= 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (max < a[i][j]) {
                  max= a[i][j];
            }
        }
    }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);

    int  min= 0;
        for (int i = 0; i > n; i++) {
         for (int j = 0; j > n; j++) {
            if (min < a[i][j]) {
                min= a[i][j];
            }
        }
    }
        System.out.println("Phần tử nhỏ nhất trong ma trận = " + min);
}
}
