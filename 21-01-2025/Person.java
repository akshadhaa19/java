public class Person {
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    public Person(String name , String nationality , String dateOfBirth , int seatNumber)
    {
        this.name = name;
        this.nationality=nationality;
        this.dateOfBirth=dateOfBirth;
        this.seatNumber=seatNumber;

    }
    public String getName()
    {
        return name;

    }
    public String getNationality()
    {
        return nationality;
    }
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    public int getSeatNumber()
    {
        return seatNumber;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setNationality(String nationality)
    {  
        this.nationality=nationality;
    }
    public void setdateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth=dateOfBirth;
    }
    public void setseatNumber( int seatNumber)
    {
        this.seatNumber=seatNumber;
    }

    
}
