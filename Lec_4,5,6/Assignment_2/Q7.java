//Binary to decimal
class Bin_to_Dec {
	public static void main(String[] args) {
		int n = 1000111;
		int mul = 1;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			n = n / 10;
			mul = mul * 2;
		}
		System.out.println(sum);
	}
}
 class Dec_to_Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 172;
		int mul = 1;
		int sum = 0;
		while (n > 0) {
			int rem = n % 2;
			sum = sum + rem * mul;
			n = n / 2;
			mul = mul * 10;
		}
		System.out.println(sum);
	}

}