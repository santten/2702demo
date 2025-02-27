import java.util.Scanner;

public class TimeCal {
    public static void main(String[] args) {
        System.out.println("Time Calculator");

        System.out.println("Enter the distance");
        Scanner in = new Scanner(System.in);
        int distance = in.nextInt();


        System.out.println("Enter the speed (km/h)");
        int speed = in.nextInt();

        System.out.println("Amount of time: " + timeCalculator(distance, speed) + "hrs");
    }

    public static double timeCalculator(double s, double v){
        return s/v;
    }
}