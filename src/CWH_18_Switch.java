import java.util.Scanner;

public class CWH_18_Switch {
    public static void main(String[] args) {
        System.out.println("For Appointment -->");
        System.out.print("Enter the name of the doctor : ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

//        Enhanced switch syntax -->
        switch (name) {
            case "Rishi" -> System.out.println("Dr. Rishi is not available today.");
            case "Roman" -> System.out.println("Dr. Roman will reach the hospital by 11a.m.");
            case "Ronnie" -> System.out.println("We will call you shortly for the appoitment.");
            default -> System.out.println("Invalid name entered.");
        }
    }
}
