public class DocComments
 {
    public static void main(String[] args)
    {

    }
    /**
     * function name : greet
     * inside the function:
     * 1. prints 'hi'
     */
    public static void greet()
    {
        System.out.println("hi");
    }

    /**
     * function name :printText
     * @param name(string)
     * @param agee(string)
     * 
     * inside the function:
     * 1. prints the name and age 
     */
    public static void printText(String name, String agee)
    {
        System.out.println("hi i am "+ name + "and i am " + agee + "age old.");
    }


    /**
     * function name : calculateArea
     * 
     * @param length(double)
     * @param width(double)
     * @return(double)
     * 
     * inside the function:
     * 1. calculates the area and returns the value
     */
    public static double calculateArea(double length,double width)
    {
        double area =length*width;
        return area;
    }
}
