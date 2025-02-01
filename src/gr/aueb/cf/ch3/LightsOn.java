package gr.aueb.cf.ch3;


import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * AND car is running (>100) OR is dark
 */
public class LightsOn {

    public static void main(String[] args) {

        boolean areLightsOn = false;
        boolean isRaining = false;
        boolean isDark = false;
        boolean isCarRunning = false;
        int carSpeed = 0;
        final int MAX_CAR_SPEED = 100;
        Scanner in = new Scanner(System.in);

        System.out.println("Is it raining? ");
        isRaining = in.nextBoolean();

        System.out.println("Is it dark? ");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed");
        carSpeed = in.nextInt();

        isCarRunning = carSpeed > MAX_CAR_SPEED;

        areLightsOn = isRaining && (isDark || isCarRunning);

        System.out.println("Turn lights on: " + areLightsOn);



    }
}
