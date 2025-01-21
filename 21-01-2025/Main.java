import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Akshadha";
        person.dateOfBirth = "19/03/2002";
        person.nationality = "Indian";
        person.seatNumber =5;
        person.passport = new String[] {
            person.name, person.nationality, person.dateOfBirth};

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
        
    }
    
}
