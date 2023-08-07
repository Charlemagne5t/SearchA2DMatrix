import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void searchMatrixTestTrue1() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        boolean actual = new Solution().searchMatrix(matrix, 3);

        Assert.assertTrue(actual);
    }
    @Test
    public void searchMatrixTestFalse1() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 13;
        boolean actual = new Solution().searchMatrix(matrix, 3);

        Assert.assertFalse(actual);
    }
}
