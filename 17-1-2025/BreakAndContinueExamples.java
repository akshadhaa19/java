public class BreakAndContinueExamples {

    public static void main(String[] args) 
    {
       System.out.println("\numbers");
       for(int i=1;i<11;i++)
       {
        if(i==5)
        {
            continue;
        }
        System.out.println(i);
       } 

       System.out.println("\n even numbers");
       for(int i=1;i<21;i++)
       {
        if(i%2==0)
        {
            continue;
        }
        System.out.println(i);
       }

       for(int i=21;i<30;i++)
       {
        if(i%3==0)
        {
            System.out.println(i);
            break;
        }
       }

    }
    
    
}

