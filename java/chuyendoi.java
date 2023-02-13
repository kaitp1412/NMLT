import java.util.Scanner;

    public class chuyendoi {
        public static void main(String[] args) {
            int money ;
            int kq ;
            System.out.println("nhap so tien ban muon chuyen doi tu usd sang vnd");
            Scanner sc = new Scanner(System.in);
            money = sc.nextInt();
            kq = money * 23000 ;
            System.out.println("so tien ban no toi la :" + kq);
        }
    }
    
