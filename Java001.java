public class Java001 {
    public static void main(String[] args) {

        int n = 5;
        int totalRows = 2 * n - 1;

        for (int i = 1; i <= totalRows; i++) {

            int spaces = Math.abs(n - i);

            // print leading spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            int width = 2 * (n - spaces) - 1;

            // print stars and inner spaces
            for (int j = 1; j <= width; j++) {
                if (j == 1 || j == width)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}