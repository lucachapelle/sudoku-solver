package baptistediot;

import baptistediot.board.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;


public class SudokuTest {

    @Test
    public void columnShouldHaveEveryNumberFromOneToNineOnce() {
        int[][] board = App.board;
        Sudoku sudoku = new Sudoku(board);

        sudoku.solve();

        Integer[] solution = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int column = 0; column < Sudoku.COLUMN_SIZE; column++){
            CellGroup c = sudoku.getBoard().getColumn(column);

            ArrayList<Cell> cells = c.getCellGroup();

            Integer[] valueCells = getAllValueNineCells(cells);
            Arrays.sort(valueCells);

            assertThat(valueCells).isEqualTo(solution);
        }
    }

    @Test
    public void rowShouldHaveEveryNumberFromOneToNineOnce() {
        int[][] board = App.board;
        Sudoku sudoku = new Sudoku(board);

        sudoku.solve();

        Integer[] solution = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int row = 0; row < Sudoku.ROW_SIZE; row++){
            CellGroup r = sudoku.getBoard().getRow(row);

            ArrayList<Cell> cells = r.getCellGroup();

            Integer[] valueCells = getAllValueNineCells(cells);
            Arrays.sort(valueCells);

            assertThat(valueCells).isEqualTo(solution);
        }
    }

    @Test
    public void squareShouldHaveEveryNumberFromOneToNineOnce() {
        int[][] board = App.board;
        Sudoku sudoku = new Sudoku(board);

        sudoku.solve();

        Integer[] solution = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int square = 0; square < Sudoku.SQUARE_SIZE; square++){
            CellGroup s = sudoku.getBoard().getSquare(square);

            ArrayList<Cell> cells = s.getCellGroup();

            Integer[] valueCells = getAllValueNineCells(cells);
            Arrays.sort(valueCells);

            assertThat(valueCells).isEqualTo(solution);
        }
    }

    private Integer[] getAllValueNineCells(ArrayList<Cell> cells){
        Integer[] res = new Integer[9];

        for(int i = 0; i < res.length; ++i){
            res[i] = cells.get(i).getValue();
        }

        return res;
    }

}
