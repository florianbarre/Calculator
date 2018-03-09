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
	public float CalculateFactorielle(float number) {
		if (number < 0) {
			number = 0;
		}else {
			float result = 1;
			float temp = number;
			while(temp != 0 ) {
				result = result * number;
				number -= 1;
			}
		number = result;
		}
		return number;
	}
	public double CalculateFactorielle(double number) {
		if (number < 0) {
			number = 0;
		}else {
			double result = 1;
			double temp = number;
			while(temp != 0 ) {
				result = result * number;
				number -= 1;
			}
		number = result;
		}
		return number;
	}
}