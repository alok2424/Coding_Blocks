import java.util.*;
class Main {

    // Counts how many students are needed if maxPages is the limit
    static int countStudents(int[] books, int maxPages) {
        int students = 1;
        int pagesSum = 0;

        for (int pages : books) {
            if (pagesSum + pages <= maxPages) {
                pagesSum += pages;
            } else {
                students++;
                pagesSum = pages;
            }
        }
        return students;
    }

    // Finds minimum possible maximum pages
    static int allocateBooks(int[] books, int n, int m) {
        if (m > n) return -1; // Not possible

        int low = 0, high = 0;

        for (int pages : books) {
            low = Math.max(low, pages); // max single book
            high += pages;              // sum of all books
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int students = countStudents(books, mid);

            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] books = new int[n];
            for (int i = 0; i < n; i++) {
                books[i] = sc.nextInt();
            }

            System.out.println(allocateBooks(books, n, m));
        }
    }
}
