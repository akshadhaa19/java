public class WeatherNetwork {
    public static void main(String[] args) {

        int temp = 25;  

        String forecast = "";

        if(temp <= -1)
        {
            forecast = " freezing ";
        }
        else if (temp <= 10)
        {
            forecast = " chilly ";
        }
        else
        {
            forecast =" warm ";
        }

     
        
        
        System.out.println(forecast);
    }
}
