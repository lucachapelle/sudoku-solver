import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class testSudokuSolver {

int[][] solvedBoard= {
            {8,1,2,7,5,3,6,4,9},
            {9,4,3,6,8,2,1,7,5},
            {6,7,5,4,9,1,2,8,3},
            {1,5,4,2,3,7,8,9,6},
            {3,6,9,8,4,5,7,2,1},
            {2,8,7,1,6,9,5,3,4},
            {5,2,1,9,7,4,3,6,8},
            {4,3,8,5,2,6,9,1,7},
            {7,9,6,3,1,8,4,5,2}
},
        unsolvedBoard= {
        {8,1,2,7,6,3,6,4,9},
        {8,4,3,6,8,2,1,7,5},
        {6,7,5,4,9,1,2,8,3},
        {1,5,4,2,3,7,8,9,6},
        {3,6,9,8,4,5,7,3,1},
        {2,8,7,1,6,9,5,3,4},
        {5,2,1,5,7,4,3,6,8},
        {4,3,8,5,2,6,9,1,7},
        {7,1,6,3,1,8,4,5,2}};

    @Test
    public void allPossibleNumbersAreInRow() {
        Sudoku sudo = new Sudoku(solvedBoard);
            sudo.solve();
            for (int i = 1; i < 9; i++) {
                for (int j=i;j<9;j++)
                assertTrue(sudo.isInRow(i,j));
            }

    }
}




