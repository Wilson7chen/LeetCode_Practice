import java.util.Arrays;

public class Rotate_Image_48 {
    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < matrix.length - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - j - 1][i];
                matrix[matrix.length - j - 1][i] = matrix[matrix.length - i - 1][matrix.length - j - 1];
                matrix[matrix.length - i - 1][matrix.length - j - 1] = matrix[j][matrix.length - i - 1];
                matrix[j][matrix.length - i - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
//        int[][] matrix =
//            {{1,2,3}
//            ,{4,5,6}
//            ,{7,8,9}}; // [[7,4,1],[8,5,2],[9,6,3]]

        int[][] matrix =
            {{5,1,9,11}
            ,{2,4,8,10}
            ,{13,3,6,7}
            ,{15,14,12,16}}; // [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}