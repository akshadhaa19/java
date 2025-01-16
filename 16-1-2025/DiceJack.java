import java.util.Scanner;

public class DiceJack 
{
    public static void main(String[] args) 
{
     Scanner scanner =new Scanner(System.in);
     
     int roll1=rollDice();
     int roll2=rollDice();
     int roll3=rollDice(); 

     System.out.println("enter three numbers between 1 and 6: ");
     int num1 = scanner.nextInt();
     int num2 = scanner.nextInt();
     int num3 = scanner.nextInt();

     if(areLessThan(num1, num2, num3) || areHigherThan(num1, num2, num3))
     {
        System.out.println("invalid range");
        System.exit(0);
     }
      int sumOfNumbers = num1 +num2 +num3;
      int sumDiceRolls = roll1 +roll2 +roll3;

      System.out.println("your sum is : " + sumOfNumbers + " dice sum : " + sumDiceRolls);

      if(userWon(sumOfNumbers, sumDiceRolls))
      {
        System.out.println("you won");
      }
      else{
        System.out.println("you lost");
      }
    

     scanner.close();
}

public static boolean areLessThan(int num1, int num2, int num3)
{
    return (num1 < 1 || num2 <1 || num3 <1);
}
public static boolean areHigherThan(int num1, int num2, int num3)
{
    return (num1>6 || num2 >6 || num3 >6);
}

public static boolean userWon(int sumNumbers , int sumDiceRolls)
{
    return ( sumNumbers > sumDiceRolls && ( sumNumbers - sumDiceRolls) <3 );
}
public static int rollDice()
{
    double randomNumber =Math.random()*6;
    randomNumber +=1;
    return (int)randomNumber; 
}
}
    
