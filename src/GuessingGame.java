import java.util.Scanner;

public class GuessingGame {
        public static void game(){
            //Declaring variables
            int number = 0;
            int randomNum = ((int) (Math.random() * 101));
            Scanner sc = new Scanner(System.in);
            //welcome msg
            System.out.println("***************************************");
            System.out.println("Welcome to the my number guessing game!");
            System.out.println("***************************************");
            //Starting the game loop
            while(number != randomNum){
                System.out.print("insert a number between 0 and 100: ");
                number = sc.nextInt();
                if(number > randomNum){
                    System.out.println("Lower");
                }
                if (number < randomNum){
                    System.out.println("Higher");
                }
            }
            System.out.println("Congrats!!! you won the number was " + number+ "!");
        }
}
