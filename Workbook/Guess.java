import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
    int secret =4;
       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
       int guess =scan.nextInt();

       while(guess != secret )
       {
        System.out.print("guess again: ");
        guess = scan.nextInt();
       }
        System.out.println("got it right");

        
        scan.close();
    }

}
