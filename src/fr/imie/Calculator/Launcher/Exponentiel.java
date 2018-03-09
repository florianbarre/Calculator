package fr.imie.Calculator.Launcher;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

public class Exponentiel {

	    public static BigInteger fact(BigInteger N){
	        BigInteger X = N;
	        if(N.compareTo(BigInteger.ONE)<=0){
	            return BigInteger.ONE;
	        }else{
	            while(N.compareTo(BigInteger.ONE)==1){
	                X = X .multiply((N = N.subtract(BigInteger.ONE)));
	            }
	        }
	        return X ;
	    }

	    public static BigDecimal exp(BigDecimal X,int n){
	        BigDecimal sol = BigDecimal.ZERO;
	        int i = 0;
	        while(i<n){
	            BigDecimal fact = new BigDecimal(fact(new BigInteger(""+i)).toString());
	            sol = sol.add(X.pow(i).divide(fact, MathContext.DECIMAL128));
	            i++;
	        }
	        return sol;
	    }

	    public static float askFloat(String message) {
			//déclaration de variable
			Scanner keyboard = new Scanner(System.in);
			float result = 0;
			boolean isOk = false;
			
			//récupération du float
			while (!isOk) {
				System.out.println(message);
					try {
						//instruction à faire
						result = keyboard.nextFloat();
						isOk = true;
					}catch(Exception e) {
						//instruction à faire en cas de probème
						keyboard.nextLine();
						isOk = false;
					}
			}
			return result;
		}
	    
	    public static float main(String[] args){
	    	float e;
	       System.out.println(Math.exp(e = askFloat("Une approximation de 'e' est :")));
	       return e;
	    }
	    
}
