
public class hahahah{

    public static void mail ( String[] args){
        int nam;
        int thang;
         Scanner ad= new Scanner(System.in);
         System.out.println( " nhập tháng : ");
         thang=ad.nextInt();
         System.out.println( " nhập năm :");
         nam=ad.nextInt();
         switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:

            System.out.println( " tháng có 31 ngày");
             break;
                case 4: case 6: case 9: case 11:
            System.out.println( " tháng có 30 ngày");
            break;
            case 2:
            if ( nam % 400==0 || (nam %4==0 && nam%100!=0))
            System.out.println( " tháng có 29 ngày");
            else
            System.out.println( " tháng có 28 ngày");
             break;
            default:
            System.out.println( " ko hợp lệ");
                break;
         }
}
}