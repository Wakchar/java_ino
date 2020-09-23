class Program {
	public static void main(String args[]) {
		int number;
		int digitsSum;
		int d1;
		int d2;
		int d3;
		int d4;
		int d5;

		number = 99999;
		if(number >= 10000 && number <= 99999){
			d1 = number / 10000;
			d2 = (number / 1000) % 10;
			d3 = (number / 100) % 10;
			d4 = (number / 10) % 10;
			d5 = number % 10;
			digitsSum = d1 + d2 + d3 + d4 + d5;
			System.out.println(digitsSum);
		}
		else {
			System.out.println("Данное число не является пятизначным");
		}
	}
}
