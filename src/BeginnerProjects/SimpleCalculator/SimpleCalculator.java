package BeginnerProjects.SimpleCalculator;

import java.util.Scanner;

import static java.lang.Math.pow;

public class SimpleCalculator {
    public  static void calculator(){
        //declaring variables
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        char operator = ' ';
        int result = 0;

        //welcome screen
        System.out.println("*************************");
        System.out.println("Simple Calculator Program");
        System.out.println("*************************");

        //User input
        System.out.print("insert the first number: ");
        num1 = sc.nextInt();
        System.out.println("insert an operator(+,-,*,/,^): ");
        operator = sc.next().charAt(0);
        System.out.printf("insert the second number: ");
        num2 = sc.nextInt();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){System.out.println("Cannot devide by zero");}
                else result = num1/num2;
            }
            case '^' -> result = (int) Math.pow(num1,num2);

        }
        System.out.println(result);
        sc.close();
    }
}
