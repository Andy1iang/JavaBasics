public class Chap03 {
    public static void main(String[] args) {

        // arrays
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(nums.length);

        char[] letters;
        letters = new char[3]; // empty character array of size 3
        System.out.println(letters[0]);

        // for loop to update array elements
        for (int i = 0; i < 3; i++) {
            letters[i] = (char) ('a' + i); // converting ascii ints to chars
        }

        // for-each loop to access (cannot modify) array elements
        for (char letter : letters) {
            System.out.println(letter);
        }

        // 2D arrays
        int[][] matrix = new int[3][3];
        // [row][column]

        // for loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = 3 * i + j;
            }
        }

        // for-each loop
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
