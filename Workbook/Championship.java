public class Championship {
    public static void main(String[] args) {

        int gryffindor = 400;    
        int ravenclaw = 200;    

        int margin = gryffindor -ravenclaw;

        if(margin >= 300)
        {
            System.out.println("Gryfinder takes the house");
        }
        else if( margin>=0)
        {
            System.out.println("in second place");
        }
        else if(margin>= -100)
        {
           System.out.println("in third place");
        }
        else
        {
            System.err.println("in fourth place");
        }
    }
}
