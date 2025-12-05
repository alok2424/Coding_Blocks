//Pascal Triangel_3
import java.util.*;
class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pascal(n);
	}

	public static void Pascal(int n) {
		int star = 1;
		int row = 0;
		while (row < n) {
			// star
			int i = 0;
			int ncr = 1;
			while (i < star) {
				System.out.print(ncr + " ");
				ncr = ((row - i) * ncr) / (i + 1);
				i++;
			}
			// next line prep
			System.out.println();
			row++;
			star++;
		}

	}

}