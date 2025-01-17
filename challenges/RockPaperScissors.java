import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String response = scan.nextLine();

        if (response.equals("yes"))
        {
           System.out.println("great"); 
           System.out.println("rock - paper - scissors, shoot");
           String userChoice = scan.nextLine();
           String compChoice = computerChoice();

           System.out.println("\nyou chose : " +userChoice);
           System.out.println("The computer chose: " +compChoice);

           String finalResult = result(userChoice,compChoice);
           printResult(userChoice, compChoice, finalResult);
        }
        else
        {
            System.out.println("some other time");
        }
              

        scan.close();
    }

      public static String computerChoice()

      {
        int randomNumber= (int)(Math.random() *3);
        if (randomNumber == 0)
        {
            return "rock";

        }
        else if(randomNumber == 1)
        {
            return "paper";
        }
        else if(randomNumber==2)
        {
            return "scissors";
        }
        else 
        {
            return "error";
        }


      }
        
        public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if(yourChoice.equals("rock") && computerChoice.equals("scissors"))
        {
            return "you win";
        }
        else if (yourChoice.equals("paper") && computerChoice.equals("rock"))
        {
            return "you win";
        }
        else if (yourChoice.equals("scissors") &&computerChoice.equals("paper"))
        {
            return "you win";
        }
        else if (yourChoice.equals("rock") &&computerChoice.equals("scissors"))
        {
            return " you lose";
        }
        else if (yourChoice.equals("paper") &&computerChoice.equals("rock"))
        {
            return " you lose"; 
        }
        else if (yourChoice.equals("scissors") &&computerChoice.equals("paper"))
        {
            return " you lose"; 
        }
        else if (yourChoice.equals(computerChoice))
        {
            return " its is a tie";
        } 
        else
        {
            System.out.println("invalid");
            System.exit(0);
        }

        return result;

      }
 
    
    public static void printResult(String yourChoice, String computerChoice, String result)
    {
        System.out.println("you chose :" +yourChoice);
        System.out.println("the computer chose " +computerChoice);
        System.out.println(result);
    }

}
