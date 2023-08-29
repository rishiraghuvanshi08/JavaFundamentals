import java.util.Scanner;

public class CHW_Ch2_PracticeSet {
    public static void main(String[] args) {
//        Question 1
        float a = 7f/4f*9f/2f;
        System.out.println(a);

//        Question 2
        char grade = 'A';
        grade = (char)(grade + 8);
        System.out.println(grade);

//        Question 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        System.out.println(x > 8);

    }
}
