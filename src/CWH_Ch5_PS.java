public class CWH_Ch5_PS {
    public static void main(String[] args) {
//        P1
//        for(int i = 4; i > 0; i--){
//            for(int j = i; j > 0; j--){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        P2
//        int sum = 0, n = 4;
//        for(int i = 1; i <= n; i++){
//            sum = sum + 2 * i;
//        }
//        System.out.println("The sum of first " + n + " even numbers is " + sum);

//        Fact
        int n = 6, fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println(fact);

    }
}
