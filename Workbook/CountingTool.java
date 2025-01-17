import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("hi timmy choose a number to count to : ");
        int num = scan.nextInt();
        System.out.println("grest here is how it is done");

        for(int a=0; a<=num;a++)
        {
           System.out.print(a +" ");
        }

        scan.close();
    }
}
