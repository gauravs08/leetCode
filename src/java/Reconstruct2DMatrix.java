// Reconstruct2DMatrix.java
// This class reconstructs a 2-row binary matrix based on the given upper, lower, and colsum arrays.
// The goal is to fill two rows such that:
//   - The sum of the first row is 'upper'
//   - The sum of the second row is 'lower'
//   - For each column i, the sum of both rows at column i is colsum[i]
//   - Only 0s and 1s are allowed in the matrix

import java.util.ArrayList;
import java.util.List;

public class Reconstruct2DMatrix {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int n = colsum.length;
        int[] row1 = new int[n];
        int[] row2 = new int[n];
        // First pass: assign 1s to both rows where colsum[i] == 2
        for (int i = 0; i < n; i++) {
            if (colsum[i] == 2) {
                row1[i] = 1;
                row2[i] = 1;
                upper--;
                lower--;
            }
        }
        // Second pass: assign 1s to either row1 or row2 where colsum[i] == 1
        // Prefer row1 (upper) if possible, otherwise row2 (lower)
        for (int i = 0; i < n; i++) {
            if (colsum[i] == 1) {
                if (upper > 0) {
                    row1[i] = 1;
                    upper--;
                } else if (lower > 0) {
                    row2[i] = 1;
                    lower--;
                } else {
                    // Not enough upper or lower left to assign, return empty result
                    return new ArrayList<>();
                }
            }
        }
        // If after assignment, upper or lower is not zero, return empty result
        if (upper != 0 || lower != 0) {
            return new ArrayList<>();
        }
        // Convert int[] to List<Integer> for the result
        List<List<Integer>> res = new ArrayList<>(2);
        List<Integer> list1 = new ArrayList<>(n);
        List<Integer> list2 = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list1.add(row1[i]);
            list2.add(row2[i]);
        }
        res.add(list1);
        res.add(list2);
        return res;
    }

    public static void main(String[] args) {
        Reconstruct2DMatrix solver = new Reconstruct2DMatrix();
        int upper = 2, lower = 1;
        int[] colsum = {1, 1, 1};
        List<List<Integer>> result;
                result= solver.reconstructMatrix(upper, lower, colsum);
        System.out.println("Test 1: upper=2, lower=1, colsum=[1,1,1]");
        for (List<Integer> row : result) {
            System.out.println(row);
        }

        upper = 2;
        lower = 3;
        colsum = new int[]{2, 2, 1, 1};
        result = solver.reconstructMatrix(upper, lower, colsum);
        System.out.println("Test 2: upper=2, lower=3, colsum=[2,2,1,1]");
        for (List<Integer> row : result) {
            System.out.println(row);
        }

        upper = 5;
        lower = 5;
        colsum = new int[]{2,1,2,0,1,0,1,2,0,1};
        result = solver.reconstructMatrix(upper, lower, colsum);
        System.out.println("Test 3: upper=5, lower=5, colsum=[2,1,2,0,1,0,1,2,0,1]");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
