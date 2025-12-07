//Conversion from any base to any base

import java.util.*;
class Main{
    // Convert number from source base to decimal
    public static int toDecimal(int sn, int sb) {
        int decimal = 0;
        int power = 1;

        while (sn > 0) {
            int digit = sn % 10;
            decimal += digit * power;
            power *= sb;
            sn /= 10;
        }
        return decimal;
    }
    // Convert decimal to destination base
    public static int fromDecimal(int decimal, int db) {
        int result = 0;
        int power = 1;

        while (decimal > 0) {
            int digit = decimal % db;
            result += digit * power;
            power *= 10;
            decimal /= db;
        }
        return result;
    }
}
