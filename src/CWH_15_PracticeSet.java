import java.util.Locale;
import java.util.Scanner;

public class CWH_15_PracticeSet {
    public static void main(String[] args) {

//        String name = "Rishi Raghuvanshi ";
//        name = name.toLowerCase(Locale.ROOT);
//        System.out.println(name);
//        System.out.println(name.replace(" ", "_"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.printf("\nLetter = Dear %s, Thanks a lot.\n", name);

        String spaces = "Hello world, i am  robot.";
        System.out.println(spaces.indexOf("  "));
        System.out.println(spaces.indexOf("   "));
    }
}
