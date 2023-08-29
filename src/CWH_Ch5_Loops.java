import java.util.Scanner;

public class CWH_Ch5_Loops {
    public static void main(String[] args) {
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);

//        System.out.println("Using Loops : ");
//        int i = 1;
//        while(i < 4){
//            System.out.println(i);
//            i++;
//        }

//        int b = 10;
//        do{
//            System.out.println("\n" + b);
//            b++;
//        }while(b < 15);

//        for(int i = 1; i < 10; i++){
//            System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

//        for(int i = 0; i < n; i++){
////            if(i % 2 != 0){
////                System.out.println(i);
////            }
//            System.out.println(2 * i + 1);
//        }


        for(int i = n ;i != 0; i--){
            System.out.println(i);
        }
    }
}
