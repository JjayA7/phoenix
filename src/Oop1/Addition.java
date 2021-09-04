package Oop1;

public class Addition {

	int x;
	int y;

	void add() {
		int sum = x + y;
		System.out.println(sum);

	}

	int add(int a, int b, int c) {
		int sum = a + b + c;
		return sum;

	}

	double add(double a, double b, double c) {
		double sum = a + b + c;
		return sum;

	}

	public static void main(String[] args) {
		Addition a1 = new Addition();
		a1.x = 100;
		a1.y = 200;
		a1.add();

		int sum1 = a1.add(200, 200, 200);
		System.out.println(sum1);
		double sum2 = a1.add(200.5, 200.35, 200.5);
		System.out.println(sum2);

		Addition a2 = new Addition();
		int sum3 = a2.add(5000, 50000, 5000);
		System.out.println(sum3);

	}// end of main

}// end of class
