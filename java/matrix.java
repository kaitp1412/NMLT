import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {

       int  n;
       int sum =0;
       Scanner  scanner= new Scanner(System.in);
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += a[i][j];
                }
            }
        }

        System.out.println("Tổng phần tử nằm trên đường chéo  = " + sum);
    }
    }


