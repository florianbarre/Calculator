package fr.imie.Calculator.Launcher;

public class Absolute {
		public int CalculateAbsolute(int number) {
			if (number < 0) {
				number = -1 * number;
			}
			return number;
		}
}
