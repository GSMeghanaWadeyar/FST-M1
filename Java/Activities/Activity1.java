package JavaActivities;

public class Activity1 {
    public static void main(String[] args) {

        Car volvo= new Car();

        volvo.make=2014;
        volvo.color="Black";
        volvo.transmission="Manual";

        volvo.displayCharacteristics();
        volvo.accelarate();
        volvo.brake();

    }
}
