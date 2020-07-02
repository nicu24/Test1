
public class Taxi extends Car{
    private String color;
    private int speed;
    public  int nbPassager;


        Taxi(String color, int speed)
        {
            this.color = color;
            this.speed = speed;
        }
        public void show()
        {
            System.out.println("Color "+ color);
            System.out.println("Speed "+ speed);

        }
        @Override
        public String toString()
        {
            return "Color: " + color + "\nSpeed: " + speed + "\nnbPassager: " + nbPassager;
        }

}
