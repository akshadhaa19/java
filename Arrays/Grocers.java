import java.util.Scanner;

public class Grocers {
    public static void main(String[] args) {

        String[] aisles = {"apples","bananas","candy","chocolate","coffee","tea"};
        Scanner scan = new Scanner(System.in);

        System.out.println("welcome to java grocers\nWhat can I help you find?");
        String name = scan.nextLine();

        for(int i=0;i<aisles.length;i++)
        {
            if(name.equals(aisles[i]))
            {
                System.out.println("We have that in aisle: "+ i);
            }
        }
        scan.close();
    }
    
}
