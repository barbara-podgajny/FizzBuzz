package main;


public class FizzBuzz {
	public static void main(String[] args) {
		FizzBuzz fizzbuzz = new FizzBuzz();
		fizzbuzz.print();
	}

	public boolean isDividable(int number, int divideByNumber) {
		if (number == 0 || divideByNumber == 0) {
			return false;
		}
		return number % divideByNumber == 0;
	}

	public String fizz(int number) {
		if (isDividable(number, 3)) {
			return "Fizz";
		} else {
			return "";
		}
	}

	public String buzz(int number) {
		if (isDividable(number, 5)) {
			return "Buzz";
		} else {
			return "";
		}
	}

	public void print() {
		for (int i = 1; i <= 100; i++) {
			String out = "";
			out += fizz(i);
			out += buzz(i);
			if(out.isEmpty()) out = String.valueOf(i);
			System.out.println(out);
		}
	}
}