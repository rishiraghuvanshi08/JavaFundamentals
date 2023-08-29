package com.company;

/**
 * This is a good class
 */
public class CWH_MethodsTags {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * Hello this is a method
     * @param a This is first number to add
     * @param b This is second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + Operator
     */
    public int add(int a, int b) throws Exception{
        if(a == 0){
            throw new Exception();
        }
        int c;
        c = a + b;
        return c;
    }
}
