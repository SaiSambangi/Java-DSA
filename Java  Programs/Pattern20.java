public class Pattern20 {
    

        static void pattern20(int n) {
            // initialising the spaces.
            int spaces = 2 * n - 2;

            // Outer loop for printing row.
            for (int i = 1; i <= 2 * n - 1; i++) {

                // stars for first half
                int stars = i;

                // stars for the second half.
                if (i > n)
                    stars = 2 * n - i;

                // for printing the stars
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }

                // for printing the spaces
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }

                // for printing the stars
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }
                System.out.println();
                if (i < n)
                    spaces -= 2;
                else
                    spaces += 2;
            }
        }

        public static void main(String[] args) {

            int N = 5;
            pattern20(N);
        }
    }


