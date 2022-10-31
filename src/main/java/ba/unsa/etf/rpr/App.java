package ba.unsa.etf.rpr;

/**
 * Input one number and print out its sine and factoriel
 * @author anida
 */
public class App 
{
    public static void main( String[] args ) throws InvalidInput {
        if(Double.parseDouble(args[1]) < 0) throw new InvalidInput("Unos je negativan broj!");

        if(args[0].equals("sin"))
            System.out.println("Sinus je: " + Calculate.sine(Double.parseDouble(args[1])));
        else {
            System.out.println("Faktorijel je: " + Calculate.factoriel(Integer.parseInt(args[1])));
        }
    }
}
