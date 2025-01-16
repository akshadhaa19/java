import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions.


        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String firstanswer = scan.nextLine();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String secondanswer = scan.nextLine();

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String thirdanswer = scan.nextLine();

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String fourthanswer = scan.nextLine();

        int score = 0;

        if(firstanswer.equals("c"))
        {
            score += 5;
        }
        else if (secondanswer.equals("a"))
        {
            score+=5;
        }
        else if(thirdanswer.equals("d"))
        {
            score+=5;
        }
        else if(fourthanswer.equals("a") || fourthanswer.equals("b"))
        {
            score+=5;
        }
        System.out.println("Your final score is: " + score + "/20");

        if(score >=15)
        {
            System.out.println("wow");
        }
        else if (score>5 && score<15)
        {
            System.out.println("not bad");
        }
        else
        {
            System.out.println("better luck");
        }
        

        scan.close();

    }
}
