package BeginnerProjects.Converter;

import java.util.Scanner;

public class Converter {
        public static void convert(){

            //Declaring variables
            int option = 0;
            double number  = 0.0;
            Scanner sc = new Scanner(System.in);

            //getting user input
            System.out.println("***************************************");
            System.out.println("****Temperature/Unit Converter!********");
            System.out.println("***************************************");
            System.out.print("Input your number: ");
            number = sc.nextDouble();
            System.out.println("1.Celcius to Fahrenheit");
            System.out.println("2.Fahrenheit to Celcius");
            System.out.println("3.km to miles");
            System.out.println("4.miles to km");
            System.out.print("Pick a option from 1 to 4: ");
            option = sc.nextInt();

            //converter
            switch (option){
                case 1 -> System.out.println((number*1.8)+32 + "f");
                case 2 -> System.out.println((number-32)/2 + "c");
                case 3 -> System.out.println((number*  0.6 + "m"));
                case 4 -> System.out.println((number* 1.6+ "km"));
                default -> System.out.println("Pick a valid option!");
            }
            sc.close();
        }
}
