public class Sudoku {

    /**
     * Constante de la taille de la Grille
     */
    public static final int SIZE = 9;

    /**
     * Constante d'une case vide de la grille
     */
    public static final int EMPTY = 0;


    /**
     * Grille de sudoku de la classe
     */
    private int[][] grid;

    /**
     * Contructeur de la classe Sudoku
     * @param grid
     */
    public Sudoku(int[][] grid){
        this.grid = grid;
    }

    /**
     * Méthode vérifiant si un entier se trouve deja dans la ligne
     * @param row
     * @param number
     * @return un booléen
     */
    private boolean isInRow(int row, int number) {
        for (int i = 0; i < SIZE; i++) {
            if (grid[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * Méthode vérifiant si un entier se trouve deja dans la colonne
     * @param col
     * @param number
     * @return un booléen
     */
    private boolean isInCol(int col, int number) {
        for (int i = 0; i < SIZE; i++){
            if (grid[i][col] == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * Méthode vérifiant si un entier se trouve deja dans une sous-grille de 3X3 cases
     * @param col
     * @param number
     * @return un booléen
     */
    private boolean isInSubgrid(int row, int col, int number) {
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (grid[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Méthode vérifiant si un entier peut etre placé à une certaine position
     * @param row
     * @param col
     * @param number
     * @return
     */
    private boolean checkPosition(int row, int col, int number) {
        return !isInRow(row, number)  &&  !isInCol(col, number)  &&  !isInSubgrid(row, col, number);
    }

    /**
     * Méthode de résolution de la grille de sudoku
     * @return
     */
    public boolean solve() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (grid[row][col] == EMPTY) {
                    for (int number = 1; number <= SIZE; number++) {
                        if (checkPosition(row, col, number)) {
                            grid[row][col] = number;

                            if (solve()) {
                                return true;
                            } else {
                                grid[row][col] = EMPTY;
                            }
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Methode verifiant que la grille ne comporte plus de 0
     * @return
     */
    public boolean isComplete(){
        boolean isComplete = true;
        int i = 0;
        int j = 0;
        while(isComplete && j < Sudoku.SIZE){
            while(isComplete && i < Sudoku.SIZE){
                if(this.grid[i][j] == Sudoku.EMPTY){
                    isComplete = false;
                }
                i++;
            }
            j++;
        }
        return true;
    }

    /**
     * Méthode d'affichage de la grille
     */
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" " + grid[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
