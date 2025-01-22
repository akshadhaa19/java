public class Main {
    public static void main(String[] args) {
        Person person = new Person("Akshadha","Indian","19/03/2002",5);

        person.setseatNumber(10);

        System.out.println("name: " +person.getName()+ "\nnationality: "+person.getNationality()+"\ndate of birth: "+person.dateOfBirth + "\nseat number: "+ person.seatNumber);
        
    }
    
}
