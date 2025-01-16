public class SwitchStatements {
    public static void main(String[] args) {

      
        String weather = "sunny";
        switch (weather) {
            case "sunny": System.out.println("wear shirt"); break;
            case "cloudy": System.out.println("sweater"); break;  
            case "rainy" : System.out.println("umbrella"); break;
        
            default: System.out.println("whatever"); break;
        }
        
        int role = 2;
        switch (role) {
            case 1: System.out.println("admin"); break;
            case 2: System.out.println("editor"); break;
            case 3: System.out.println("user"); break;
            default :System.out.println("contact HR");
        }
      
        int temperature = 75;
        int humidity = 65;
        
        if(temperature >=80 && humidity>=60)
        {
            System.out.println("too hot and humid \n");
        } 
        else if(temperature>=80)
        {
            System.out.println("too hot\n");
        }
        else if (temperature<=60 && humidity >=60)
        {
            System.out.println("too cold and humid\n");
        }
        else
        {
         System.out.println("confortable\n");
        }


        int age = 25;
        int income = 50000;
        if (age>=18 && income>=30000)
        {
            System.out.println("eligible for credit card");
        }
        else
        {
            System.out.println("not eligible");
        }
    
        
        String lightColor = "green";
        switch(lightColor)
        {
            case "green": System.out.println("go");break;
            case "yellow" :System.out.println("wait");break;
            case "red" : System.out.println("stop"); break;
                
     }

    
        int score = 85;
        if(score >=80){
        System.out.println("You got an A!");}
        else if(score>=70){
        System.out.println("You got a B!");}
        else if(score >=60){
        System.out.println("You got a C.");}
        else if (score >=50){
        System.out.println("You got a D.");}
        else{
        System.out.println("You failed :(");}


        
        String browser = "Chrome";
        switch (browser) {
            case "chrome": System.out.println("enjoy");break;
            case "firefox" : System.out.println("best browser");break;
            case "safari" : System.out.println("apple user");
            default : System.out.println("curious to know");
        }
        
        

    }
}
