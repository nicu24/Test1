import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//Objects
        Taxi Bmw = new Taxi("Red",150);
        Bmw.nbPassager=5;
        Bmw.tires=5;


        Taxi Scoda = new Taxi("Black",220);
        Scoda.nbPassager=5;
        Scoda.tires=5;

 // Hash Map
        HashMap<String, Taxi> Agency = new HashMap<String,Taxi>();

        Agency.put("Bmw", Bmw);
        Agency.put("Scoda", Scoda);

// Get

        System.out.println(Agency.get("Bmw"));
        System.out.println(Agency.size());

        System.out.println(Agency.get("Scoda"));
        System.out.println(Agency.size());


    }
}
