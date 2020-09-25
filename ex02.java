class Program {
	public static void main(String args[]) {
		int number;
		int binary_1;
		int binary_2;
		int binary_3;
		int binary_4;
		int binary_5;
		int binary_6;
		int binary_7;
		int binary_8;
		int binary_9;
		int binary_10;
		int binary_11;
		int binary_12;
		int binary_13;
		int binary_14;
		int binary_15;
		int binary_16;
		int binary_17;
		int nbr_mod1;
		int nbr_mod2;
		int nbr_mod3;
		int nbr_mod4;
		int nbr_mod5;
		int nbr_mod6;
		int nbr_mod7;
		int nbr_mod8;
		int nbr_mod9;
		int nbr_mod10;
		int nbr_mod11;
		int nbr_mod12;
		int nbr_mod13;
		int nbr_mod14;
		int nbr_mod15;
		int nbr_mod16;
		int nbr_mod17;

		number = 20001;
		if (number >= 10000 && number <= 99999) {
			binary_1 = number % 2;
			nbr_mod1 = number / 2;
			binary_2 = nbr_mod1 % 2;
			nbr_mod2 = nbr_mod1 / 2;
			binary_3 = nbr_mod2 % 2;
			nbr_mod3 = nbr_mod2 / 2;
			binary_4 = nbr_mod3 % 2;
			nbr_mod4 = nbr_mod3 / 2;
			binary_5 = nbr_mod4 % 2;
			nbr_mod5 = nbr_mod4 / 2;
			binary_6 = nbr_mod5 % 2;
			nbr_mod6 = nbr_mod5 / 2;
			nbr_mod7 = nbr_mod6 / 2;
			binary_7 = nbr_mod6 % 2;
			nbr_mod8 = nbr_mod7 / 2;
			binary_8 = nbr_mod7 % 2;
			nbr_mod9 = nbr_mod8 / 2;
			binary_9 = nbr_mod8 % 2;
			nbr_mod10 = nbr_mod9 / 2;
			binary_10 = nbr_mod9 % 2;
			nbr_mod11 = nbr_mod10 / 2;
			binary_11 = nbr_mod10 % 2;
			nbr_mod12 = nbr_mod11 / 2;
			binary_12 = nbr_mod11 % 2;
			nbr_mod13 = nbr_mod12 / 2;
			binary_13 = nbr_mod12 % 2;
			nbr_mod14 = nbr_mod13 / 2;
			binary_14 = nbr_mod13 % 2;
			nbr_mod15 = nbr_mod14 / 2;
			binary_15 = nbr_mod14 % 2;
			nbr_mod16 = nbr_mod15 / 2;
			binary_16 = nbr_mod15 % 2;
			nbr_mod17 = nbr_mod16 / 2;
			binary_17 = nbr_mod16 % 2;
			System.out.printf("%d %d %d %d %d %d %d %d %d %d %d %d %d %d %d %d %d \n", binary_17, binary_16, binary_15, binary_14, binary_13, binary_12, binary_11, binary_10, binary_9, binary_8, binary_7, binary_6, binary_5, binary_4, binary_3, binary_2, binary_1);
		}
		else {
			System.out.println("Данное число не является пятизначным");
		}
	}
}
