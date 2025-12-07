
class Main{

    public static int inverse(int n) {
        int position = 1;
        int inverse = 0;

        while (n > 0) {
            int digit = n % 10;  // current digit
            // place "position" at index = digit
            inverse += position * (int)Math.pow(10, digit - 1);

            position++;
            n /= 10;
        }

        return inverse;
    }
}
