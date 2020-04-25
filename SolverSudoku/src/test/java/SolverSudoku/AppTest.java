package SolverSudoku;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Test 1.
     * Test if the grid is correct and valid.
     */
    @Test
    public void gridIsValid()
    {
        int[][] grid = {
                { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
                { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
                { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
                { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
                { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
                { 0, 9, 0, 0, 0, 0, 4, 0, 0 }
        };

        Sudoku sudoku = new Sudoku(grid);
        assertTrue( sudoku.isValid() );
    }

    /**
     * Test 2.
     * Test : check a full grid.
     */
    @Test
    public void checkFullGrid()
    {
        int[][] grid = {
                { 5, 2, 6, 7, 1, 8, 9, 4, 3 },
                { 1, 4, 8, 9, 2, 3, 7, 6, 5 },
                { 7, 9, 3, 6, 4, 5, 8, 1, 2 },
                { 9, 6, 5, 2, 3, 7, 4, 8, 1 },
                { 3, 8, 7, 4, 5, 1, 2, 9, 6 },
                { 4, 1, 2, 8, 9, 6, 5, 3, 7 },
                { 8, 3, 1, 5, 7, 4, 6, 2, 9 },
                { 2, 5, 4, 1, 6, 9, 3, 7, 8 },
                { 6, 7, 9, 3, 8, 2, 1, 5, 4 }
        };

        Sudoku sudoku = new Sudoku(grid);
        assertTrue( sudoku.isResolvedCorrectly() );

    }

  
}