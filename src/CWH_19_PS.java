import java.util.Scanner;

public class CWH_19_PS {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        /*
        Question 1 -->
        byte m1, m2, m3;

        System.out.println("Enter marks of physics");
        m1 = sc.nextByte();

        System.out.println("Enter marks of maths");
        m2 = sc.nextByte();

        System.out.println("Enter marks of chemistry");
        m3 = sc.nextByte();

        float avg = (m1 + m2 + m3) / 3f;
        System.out.println("Overall percentage is " + avg);

        if(avg >= 40 && m1 >= 33 && m3 >= 33 && m2 >= 33){
            System.out.println("Congratulations, You have been promoted.");
        }
        else{
            System.out.println("Sorry, You have not been promoted.");
        }
        */
        /*
        int salary;
        float tax;
        System.out.print("Enter Salary : ");
        salary = sc.nextInt();

        if(salary < 250000){
            System.out.println("No tax payable");
        }
        else if(salary >= 250000 && salary < 500000){
            tax = 0.05f * salary;
            System.out.println("Tax Payable 1: " + tax);
        }
        else if(salary >= 500000 && salary < 1000000){
            tax = 0.2f * salary;
            System.out.println("Tax Payable 2: " + tax);
        }
        else if(salary >= 1000000){
            tax = 0.3f * salary;
            System.out.println("Tax Payable 3: " + tax);
        }
        */
        /*
        System.out.println("Enter Number ( between 1 to 7 ) : ");
        int num = sc.nextInt();

        if(num > 7 || num < 1){
            System.out.println("Invalid Input");
        }
        switch(num){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
         */

//        int year = sc.nextInt();
//        float rem = year % 4;
//        if(rem != 0){
//            System.out.println("Not a leap year");
//        }
//        else{
//            System.out.println("leap year");
//        }

        Scanner sc = new Scanner(System.in);
        String website = sc.next();

        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a commertial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }

        // Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in Lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("The total tax paid by the employee is: " + tax);
    }
}
