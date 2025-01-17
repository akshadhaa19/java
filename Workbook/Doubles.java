public class Doubles {
    public static void main(String[] args)
     {
        int dice1 = rollDice();
        int dice2= rollDice();

        System.out.println("dice 1 :"+ dice1);
        System.out.println("dice2 : " +dice2+ "\n");
    

        while(dice1 !=dice2)

        {
             dice1 = rollDice();
             dice2= rollDice();

            System.out.println("dice 1 :"+ dice1);
            System.out.println("dice2 : " +dice2+ "\n");
    
        }

        System.out.println("you rolled doubles");


    }

    public static int rollDice()
    {
        double randomDecimal= Math.random() *6;
        randomDecimal+=1;
        return (int)randomDecimal;
    }



}





