package fr.imie.Calculator.Launcher;
import java.util.Scanner;

public class Sroot{
	
	public static double main(String[] args) {
	    double number, t, squareRoot;
	    Scanner input = new Scanner(System.in);
	    number = input.nextDouble();
	    squareRoot = number / 2;
	    do
	    {
	        t = squareRoot;
	        squareRoot = (t + (number / t)) / 2;
	    }
	    while ((t - squareRoot) != 0);
	
	    input.close();
	    
	    return squareRoot
	}
}