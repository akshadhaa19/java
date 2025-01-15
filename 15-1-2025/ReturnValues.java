public class ReturnValues {
    public static void main(String[] args) 
        {
        double area= calculateArea(2.3, 4.5);
        printArea(2.3,4.5,area);
      
        
        }

    public static double calculateArea(double length , double breadth)
       {
        double area = length*breadth;
        return area;
       }

    public static String explainArea(String language)
      {
        switch (language)
          {
            case "English": return "Area equals length * width";
            case "French" : return "La surface est egale a la longueur * la largeur";
            case "Spanish" : return "area es igual a largo * ancho";
            default : return "language not available";
          }
      }
      public static void printArea(double length,double breadth,double area)
     {
        System.out.println("a rectangle with length"+ length+ "and breadth"+ breadth + " has an area of "+ area);  
        
     }
}


