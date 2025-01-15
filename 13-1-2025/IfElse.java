public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        if(biologyGrade>chemistryGrade){
            System.out.println("Yes you did!");
        }
        else{
            System.out.println("No you didnt.");
        }
        

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        if (sales>costs){
            System.out.println("yes we rich");
        }
        else{
            System.out.println("no we didnt");
        }
        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        if(temperature<targetTemperature)
        {
            System.out.println("yes it is cold");
        }
        else 
        {
            System.out.println("no it isnt ");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        if(currentSpeed<speedLimit)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        if(age<retirementAge)
        {
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        if(myGrade == bestGrade)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        if(word==secondWord)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("NO THEY ARE DIFFERENT");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        if(!thirdWord.equals(fourthWord)){
            System.out.println("yes");
        }
        else{
            System.out.println("no they are the same");
        }
    }
}
