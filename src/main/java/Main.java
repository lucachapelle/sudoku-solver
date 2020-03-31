public class Main {

    public static void main(String[] args) {
        int[][] board_1 = {
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

        int[][] board_2 = {
                {9, 3, 4, 1, 7, 2, 6, 8, 5},
                {7, 6, 5, 8, 9, 3, 2, 4, 1},
                {8, 1, 2, 6, 4, 5, 3, 9, 7},
                {4, 2, 9, 5, 8, 1, 7, 6, 3},
                {6, 5, 8, 7, 3, 9, 1, 2, 4},
                {1, 7, 3, 4, 2, 6, 8, 5, 9},
                {2, 9, 7, 3, 5, 8, 4, 1, 6},
                {5, 4, 6, 2, 1, 7, 9, 3, 8},
                {3, 8, 1, 9, 6, 4, 5, 7, 2}
        };

        Solver s1 = new Solver(board_1);
        s1.affichage();

        if (s1.resoudre()) {
            System.out.println(">>> resoluble <<<");
        } else {
            System.out.println(">>> pas resoluble <<<");
        }

        System.out.println();

        Solver s2 = new Solver(board_2);
        s2.affichage();

        if (s2.resoudre()) {
            System.out.println(">>> resoluble <<<");
        } else {
            System.out.println(">>> pas resoluble <<<");
        }
    }


}
