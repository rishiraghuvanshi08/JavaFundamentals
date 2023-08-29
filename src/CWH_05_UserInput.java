import java.nio.Buffer;
import java.util.Scanner;

public class CWH_05_UserInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
//        int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.print("Enter the second number : ");
//        int b = sc.nextInt();
        float b = sc.nextFloat();
        float sum = a + b;
        System.out.println("The sum of a and b is " + sum);


        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        System.out.println(s);

        System.out.print("Enter a value : ");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

    }
}
