import java.util.Scanner;

public class NumberGuessingGame{

    public void playGame(){
        System.out.println("Welcome to the Number Guessing Game");
         System.out.println("You can attempts upto 5 times only"); 
        int max=100;
        int min=1;
        int attempts=0;
        int targetNumber=(int)(Math.random()*((max-min+1)+min));
         System.out.println(targetNumber); 
        //  displaying target number for testing
  
        while(true){
              System.out.println("Enter the number between 1 to 100"); 
              Scanner scanner = new Scanner(System.in);
              int guessNumber = scanner.nextInt();
              attempts++;
              if(attempts<=5){
                    if(guessNumber==targetNumber){
                        System.out.println("Congratulations ! you guessed the correct number in "+attempts+" attempts");
                         break;
                    }else if(guessNumber>targetNumber){
                        System.out.println("Too high. Try Again");
                     
                    }
                    else{
                        System.out.println("Too low.Try Again");
                      }
                }else{
                    break;
                }
        }
        playAgain();
      
    
        
    }

    public void playAgain(){
        System.out.println("Do you want to play again?(yes/no)");
        Scanner scanner=new Scanner(System.in);
        String choice = scanner.next();

        if(choice.equalsIgnoreCase("yes")){
            playGame();
        }
        else{
            System.out.println("Thank you for playing.Good Bye!");
        }

    }
    static public  void main(String[] args) {
        System.out.println(100+100+"hello");
        System.out.println("hello"+100+100);
         NumberGuessingGame game= new NumberGuessingGame();
         game.playGame();
        
    }

}