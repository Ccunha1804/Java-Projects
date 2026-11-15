import BeginnerProjects.Converter.Converter;
import BeginnerProjects.NumbersGuessingGame.GuessingGame;
import BeginnerProjects.RockPaperScissors.RockPaperScissorsGame;
import BeginnerProjects.SimpleCalculator.SimpleCalculator;

void main(){
    //Declaring variables
    int input = 0;
    Scanner sc = new Scanner(System.in);
    //interface
    System.out.println("1. Numbers guessing game");
    System.out.println("2. Calculator");
    System.out.println("3. Temperature/distance Converter");
    System.out.println("4. Rock Paper Scissors game");
    System.out.print("Choose an Option:");
    input = sc.nextInt();
    switch(input){
        case 1 -> GuessingGame.game();
        case 2 -> SimpleCalculator.calculator();
        case 3 -> Converter.convert();
        case 4 -> RockPaperScissorsGame.rockPaperScissors();
    }
}