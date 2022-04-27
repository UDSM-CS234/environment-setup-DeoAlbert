public class position {
    public static void main(String[] args) {
        double g = -9.81;              // Earth's gravity in m/s^2
        double v = 0.0;               //initial speed
        double t = 10.0;            //time of flight
        double x = 0.0;             //initial position
        x = 0.5 * g * t * t + v * t + x;      //Final position
        System.out.println("The object's position after " + t +
                " seconds is " + x + " m.");
    }
}
