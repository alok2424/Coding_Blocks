//R4-- pattern
class Main {
    public static void main(String[] args) {
        int n = 3;
        int row = 1;
        int star = 1;
        while (row <= n) {
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }

            System.out.println();
            row++;
            star++;
        }
    }
}
