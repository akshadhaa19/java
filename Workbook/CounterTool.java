import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");
        System.out.println("pick a number to count by: ");
        int num= scan.nextInt();
        System.out.println("pick a number to start counting from: ");
        int num1 = scan.nextInt();
        System.out.println("pick a number to count to: ");
        int num2 = scan.nextInt();

        for( int a=num1;a<=num2; a+=num)
        {
            System.out.print(a +" " );
        }


        scan.close();
    }
}
