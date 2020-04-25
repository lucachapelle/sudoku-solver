import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SudokuTest {

    public static final int[][] grid = {
            {8, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 3, 6, 0, 0, 0, 0, 0},
            {0, 7, 0, 0, 9, 0, 2, 0, 0},
            {0, 5, 0, 0, 0, 7, 0, 0, 0},
            {0, 0, 0, 0, 4, 5, 7, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 3, 0},
            {0, 0, 1, 0, 0, 0, 0, 6, 8},
            {0, 0, 8, 5, 0, 0, 0, 1, 0},
            {0, 9, 0, 0, 0, 0, 4, 0, 0}
    };
    private Sudoku sudoku;

    public static final int[] possibilities = {1, 2, 3, 4, 5, 6, 7, 8, 9};



    @BeforeEach
    public void createAndResolve(){
        this.sudoku = new Sudoku(SudokuTest.grid);
        this.sudoku.solve();
    }

   @Test
    public void gridIsComplete(){
        assertTrue(this.sudoku.isComplete());
    }

    @Test
    public void everyNumberInLine(){

    }

    @Test
    public void everyNumberInColumn(){

    }

    @AfterEach
    public void displayGrid(){
        this.sudoku.display();
    }

}
