package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class Taximeter02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km;
        System.out.print("Please enter the km:");
        km = input.nextDouble();

        final double minTutar = 20.0;
        double toplamTutar;
        double ucret;


        toplamTutar = 10.0 + (km * 2.20);
        ucret = (toplamTutar >= 20.0) ? 1 : 0;

        System.out.println("Cost: " + ((ucret == 1) ? toplamTutar : minTutar));

    }
}

