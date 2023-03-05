package Boks;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Fighter Joshua = new Fighter("Joshua", 15, 100, 90, 0 );
        Fighter Khabib = new Fighter("Khabib", 18, 90, 90,0);
        Ring r = new Ring(Joshua, Khabib, 90, 100);
        r.run();
    }
}