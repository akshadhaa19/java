import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        String line = scan.nextLine();
        
        for(int a =1;a<100;a++)
        {
            System.out.println(a +"." +line);

        }

    }
}
