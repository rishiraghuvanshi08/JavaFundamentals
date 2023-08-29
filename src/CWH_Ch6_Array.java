import java.util.Scanner;

public class CWH_Ch6_Array {
    public static void main(String[] args) {
//        /* Classroom of 500 students - You have to store marks of these 500 students
//        You have 2 options:
//        1. Create 500 variables
//        2. Use Arrays (recommended)
//        */
//        // There are three main ways to create an array in Java
//        // 1. Declaration and memory allocation
//        // int [] marks = new int[5];
//
//        // 2. Declaration and then memory allocation
////         int [] marks;
////         marks = new int[5];
//        // Initialization
//        // marks[0] = 100;
//        // marks[1] = 60;
//        // marks[2] = 70;
//        // marks[3] = 90;
//        // marks[4] = 86;
//
//        // 3. Declaration, memory allocation and initialization together
////        int [] marks = {98, 45, 79, 99, 80};
//
//        // marks[5] = 96; - throws an error
////        System.out.println(marks[4]);
////        System.out.println(marks.length);
//
//        /*
//        float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
//        String [] students ={"Harry", "Rohan", "Shubham", "Lovish"};
//        System.out.println(students.length);
//        System.out.println(students[2]);
//        */
//
//        int[] marks = {98, 45, 79, 99, 80};
//        // System.out.println(marks.length);
//
//        // Displaying the Array (Naive way)
//        System.out.println("Printing using Naive way");
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
//
//        // Displaying the Array (for loop)
//        System.out.println("Printing using for loop");
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//        }
//
//        // Quick Quiz: Displaying the Array in Reverse order (for loop)
//        System.out.println("Printing using for loop in reverse order");
//        for (int i = marks.length - 1; i >= 0; i--) {
//            System.out.println(marks[i]);
//        }
//
//        // Quick Quiz: Displaying the Array (for-each loop)
//        System.out.println("Printing using for-each loop");
//        for (int element : marks) {
//            System.out.println(element);
//        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < array.length; i++){
            System.out.print("Enter element of index " + (i+1) + " : ");
            array[i] = sc.nextInt();
        }
        for (int element: array) {
            System.out.println(element);
        }
    }
}
