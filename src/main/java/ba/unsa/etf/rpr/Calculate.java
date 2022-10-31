package ba.unsa.etf.rpr;

/**
 * Class that calculates sine and factoriel
 */
public class Calculate {
    public static long factoriel(int x) {
        long fakt = 1;
        for (int i = 2; i <= x; i++)
            fakt *= i;
        return fakt;
    }

    public static double sine(double n) {
        int predznak = 1;
        double sin = 0;
        for (int i = 1; i <= 2*5-1; i += 2) {
            sin += predznak * Math.pow(n,i) / factoriel(i);
            predznak = -predznak;
        }
        return sin;
    }
}
