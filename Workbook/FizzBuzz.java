public class FizzBuzz {
    public static void main(String[] args) {
      
        for(int a=0;a<19;a++)
        {
            if(a%3==0 && a%5==0)
            {
                System.out.println(a+" fizzbuzz");
            }

            else if(a%3 ==0)
            {
                System.out.println(a+" fizz");
            }
            else if(a%5 ==0)
            {
                System.out.println(a+" buzz");
            }
           
        }

    }

}
