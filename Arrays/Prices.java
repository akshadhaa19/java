public class Prices {
    public static void main(String[] args) {
       double price[][] = {
        {12.99,8.99,9.99,10.49,11,99},{0.99,1.99,2.49,1.49,2.49},{3.56,4.64,2.34,6.88,9.99}
       };

       for(int i=0;i<price.length;i++)
       {
        switch (i) {
            case 0: System.out.print("\t baking: "); break;
            case 1: System.out.print("\t beverage: "); break;
            case 2: System.out.print("\tcereals: "); break;
        }
        for(int j=0;j<price[i].length;j++)
        {
            System.out.print(price[i][j]);
        }
        System.out.println("\n");

    }
}
}
