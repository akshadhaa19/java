import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" lets play rolling java. type anything to start");
        scan.nextLine();
        System.out.println("great here are the rules\n if you roll a 6 game stops \n if you roll a 4 nothing happens \n otherwise you get 1 point \n you must collect atleast 3 points to win. enter anything to roll ");
        scan.nextLine();

        int score =0;

        while (true) 
        {
            scan.nextLine();
            int diceRoll = rollDice();
             System.out.println("you rolled a "+ diceRoll);
             if(diceRoll==6)
             {
                System.out.println("end ");
                break;
             }
             else if(diceRoll==1)
             {
                System.out.println("zero pointskeep rolling");
             }
             else
             {
                score++;
                System.out.println("one point keep rolling");
             }
            
        
        }
        if(score >=3)
        {
            System.out.println("win");
        }
        else
        {
            System.out.println("lose");
        }
        scan.close();
        
        

    }
    public static int rollDice()
    {
        double randomNumber = Math.random() *6;
        randomNumber++;
        return (int)randomNumber;
    }
  
  

  
  
}
