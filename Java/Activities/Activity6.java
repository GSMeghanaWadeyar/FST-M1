package JavaActivities;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {

        Plane plane = new Plane(50);

        plane.onboard("Sean");
        plane.onboard("Ross");
        plane.onboard("Emma");

        System.out.println("Plane took off time: " + plane.takeOff());

        System.out.println("People on the plane are: " + plane.getPassengers());

        Thread.sleep(5000);

        plane.land();

        System.out.println("Plane landed at time: " + plane.getLastTimeLanded());

    }
}
