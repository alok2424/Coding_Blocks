//isArmStrong
import java.util.*;
class Main{

    public static boolean Is_Armstrong(int n) {
		int cod = countofdigit(n);
		int sum = 0;
		int temp=n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, cod));
			n = n / 10;
		}
		if (sum == temp) {
			return true;
		} else {
			return false;
		}
	}

	public static int countofdigit(int n) {
		int c = 0;
		while (n > 0) {
			c++;
			n = n / 10;
		}
		return c;
	}
}
