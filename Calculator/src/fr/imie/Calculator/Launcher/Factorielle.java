package fr.imie.Calculator.Launcher;

public class Factorielle {
	public int CalculateFactorielle(int number) {
		if (number < 0) {
			number = 0;
		}else {
			int result = 1;
			int temp = number;
			while(temp != 0 ) {
				result = result * number;
				number -= 1;
			}
		number = result;
		}
		return number;
	}
}
