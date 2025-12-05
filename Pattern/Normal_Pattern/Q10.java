class Main {
    public static void main(String[] args) {
        int n = 3;
        int row = 1;
        int space = n - 1;

        while (row <= 2 * n - 1) {

            int mirror = row <= n ? row : 2 * n - row;
            int num = mirror;

            // spaces
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }

            // increasing numbers: num to (2*num-1)
            int i = num;
            while (i <= 2 * num - 1) {
                System.out.print(i + " ");
                i++;
            }

            // decreasing numbers: (2*num-2) down to num
            int k = 2 * num - 2;
            while (k >= num) {
                System.out.print(k + " ");
                k--;
            }

            // update for next row
            if (row < n) {
                space--;
            } else {
                space++;
            }

            System.out.println();
            row++;
        }
    }
}
