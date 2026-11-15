package BeginnerProjects.RockPaperScissors;

import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class RockPaperScissorsGame {
    public static void rockPaperScissors(){
        //Declaring Variables
        String[] options = {"ROCK","PAPER","SCISSORS"};
        String user_Input = " ";
        String computer_Input;
        int player_Score = 0;
        int computer_Score = 0;
        Scanner sc = new Scanner(System.in);
        while(!user_Input.equals("0")){
            System.out.print("Input Rock Paper or Scissors: ");
            user_Input= sc.nextLine().toUpperCase();
            computer_Input = options[((int) (Math.random() * 3))];
            if(user_Input.equals("0")){break;}
            else if((user_Input.equals("ROCK")) && computer_Input.equals("PAPER")
                ||(user_Input.equals("PAPER")) && computer_Input.equals("SCISSORS")
                || (user_Input.equals("SCISSORS")) && computer_Input.equals("ROCK")){
                System.out.println("Computer Wins");
                computer_Score +=1;
            }
            else System.out.println("Player Wins");
            player_Score +=1;

            System.out.println("Computer Score: "+ computer_Score +" || " +"Player Score: "+ player_Score);
            System.out.println("Press 0 to exit.");
        }
        sc.close();
    }

}
