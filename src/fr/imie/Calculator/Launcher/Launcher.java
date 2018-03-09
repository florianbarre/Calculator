package fr.imie.Calculator.Launcher;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		float a, b, result;
		char operation;
		char restart = 'N';
		
		System.out.println("bonjour et bienvenue dans la calculatrice !");
		
		//Coeur du programme
		do {
			a = askFloat("Entrez le premier nombre !");
			
			do {
				operation = askChar("Rentrez l'op�rateur !");
			}while(operation != '+' && operation != '-' && operation != '/' && operation != '*');
			
			b = askFloat("Entrez le deuxi�me nombre !");
			
			result = calcul(a, operation, b);
			
			System.out.println("Le r�sultat de l'op�ration " + a + " " + operation + " " + b + " est : " + result );
			
			restart = askChar("voulez-vous recommencer ? (O/Y pour recommencer) ");
			
		}while(restart == 'O' || restart == 'o' || restart == 'Y' || restart == 'y');		
		
		System.out.println("Au revoir !");
	}
	public static float askFloat(String message) {
		//d�claration de variable
		Scanner keyboard = new Scanner(System.in);
		float result = 0;
		boolean isOk = false;
		
		//r�cup�ration du float
		while (!isOk) {
			System.out.println(message);
				try {
					//instruction � faire
					result = keyboard.nextFloat();
					isOk = true;
				}catch(Exception e) {
					//instruction � faire en cas de prob�me
					keyboard.nextLine();
					isOk = false;
				}
		}
		return result;
	}
	
	
	public static char askChar(String message) {
		//d�claration de variable
		Scanner keyboard = new Scanner(System.in);
		char result = 0;
		boolean isOk = false;
		String line;
		
		//r�cup�ration du char
		while (!isOk) {
			System.out.println(message);
				try {
					//instruction � faire
					line = keyboard.nextLine();
					result = line.charAt(0);
					isOk = true;
				}catch(Exception e) {
					//instruction � faire en cas de prob�me
					keyboard.nextLine();
					isOk = false;
				}
		}
		return result;
	}


	public static float calcul(float a, char operation, float b) {
		float result = 0;
		
		switch(operation) {
		case '/':
			if (b == 0) {
				System.out.println("Erreur : Division par z�ro !");
				System.exit(1);
			}
			result = a / b;
			break;
		case '*':
			result = a * b;
			break;
		case '-':
			result = a - b;
			break;
		case '+':
			result = a + b;
			break;
		default:
			System.out.println("Erreur : op�rateur inconnu !");
		}
		return result;
		
	}
	}
