package JavaActivities;

public class Activity3 {
    public static void main(String[] args) {
        double seconds = 1000000000;

        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;

        double[] array = {EarthSeconds, MercurySeconds, VenusSeconds, MarsSeconds, JupiterSeconds, SaturnSeconds, UranusSeconds, NeptuneSeconds};
        double ageOnEarth = seconds / array[0];
        System.out.println("Age on Earth: " + ageOnEarth);

        for (int i = 1; i < array.length; i++) {

            if (array[i] == MercurySeconds) {
                System.out.println("Age on Mercury: " + ageOnEarth / array[i]);
            }
            if (array[i] == VenusSeconds) {
                System.out.println("Age on Venus: " + ageOnEarth / array[i]);
            }
            if (array[i] == MarsSeconds) {
                System.out.println("Age on Mars: " + ageOnEarth / array[i]);
            }
            if (array[i] == JupiterSeconds) {
                System.out.println("Age on Jupiter: " + ageOnEarth / array[i]);
            }
            if (array[i] == SaturnSeconds) {
                System.out.println("Age on Saturn: " + ageOnEarth / array[i]);
            }
            if (array[i] == UranusSeconds) {
                System.out.println("Age on Uranus: " + ageOnEarth / array[i]);
            }
            if (array[i] == NeptuneSeconds) {
                System.out.println("Age on Neptune: " + ageOnEarth / array[i]);
            }
        }
    }
}

