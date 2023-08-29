import java.util.Scanner;

public class CWH_16_17_conditionals_ope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter Your Age : ");
        age = sc.nextInt();
        if(age >= 18 && age <= 100){
            System.out.println("You are eligible to vote.");
        }
        else if(age > 100 || age < 2){
            System.out.println("Please enter a valid age.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }

    }
}
