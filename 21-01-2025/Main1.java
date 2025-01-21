public class Main1 {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 100000, 2020, "green");
        Car dodge = new Car("Dodge",120000,0,null);

        dodge.make ="Dodge";
        dodge.price = 110000;
        dodge.year= 2019;
        dodge.color="Blue";


        System.out.println("This "+ nissan.getMake() +" is worth $ " + nissan.getPrice() + ". It was built in "+ nissan.getYear() + " .It is "+ nissan.getColor() + ".\n ");
        System.out.println("This "+dodge.getMake() + " is worth $" + dodge.getPrice() +". It was built in "+ dodge.getYear() + ". It is "+ dodge.getColor() + ".\n");
    }
    
}
