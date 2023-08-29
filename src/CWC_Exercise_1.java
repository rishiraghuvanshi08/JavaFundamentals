import java.util.Scanner;
class Subject{
    String name;
    float m, s, h, c, e, total, percentage;
}

public class CWC_Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Subject s1 = new Subject();

        System.out.print("Enter Name of student 1 : ");
        s1.name = sc.nextLine();
        System.out.println("Enter Marks : ");
        System.out.print("Maths : ");
        s1.m = sc.nextFloat();
        System.out.print("English : ");
        s1.e = sc.nextFloat();
        System.out.print("Science : ");
        s1.s = sc.nextFloat();
        System.out.print("Hindi : ");
        s1.h = sc.nextFloat();
        System.out.print("Computer : ");
        s1.c = sc.nextFloat();

        s1.total = s1.c + s1.e + s1.s + s1.m + s1.h;
        s1.percentage = s1.total / 5;

        System.out.println("Student Name : " + s1.name);
        System.out.println("Percentage is " + s1.percentage);
    }
}
