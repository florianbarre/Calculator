package fr.imie.Calculator.Launcher;

import java.util.Scanner;

public class tan {
	
	 public static double main(String args[]) {
		   
		  Scanner user = new Scanner(System.in); 

	      System.out.println("Veuillez saisir des degrees :"); 
	      
	      double ent = user.nextDouble(); 
	      double radian = Math.toRadians(ent);
	      
	      System.out.format("Le sinus de %.1f est : %.4f%n", ent, Math.tan(radian) );
	      return radian;
	 }
}
