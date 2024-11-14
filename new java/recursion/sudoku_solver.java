package recursion;

public class sudoku_solver {
    public static void main(String[] args) {
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0,6,3,0,0}};
        SudokuSolver(grid,0,0);
    }
    public static void SudokuSolver(int[][] grid, int row, int col) {
		if (col == 9) {
			row++;
			col = 0;
		}
		if (row == 9) {
			Display(grid);
			return;
		}
		if (grid[row][col] != 0) {
			SudokuSolver(grid, row, col + 1);
		}
		else {
			for (int val = 1; val <= 9; val++) {
				if (isitpossible(grid, row, col, val) == true) {
					grid[row][col] = val;
					SudokuSolver(grid, row, col + 1);
					grid[row][col] = 0;// undo

				}

			}

		}


    
}
}
