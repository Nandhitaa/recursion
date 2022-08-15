package recursion.basic;

public class SudokuSolver {

	private boolean valid(int[][] board, int row, int col, int num) {
		for (int i = 0; i < 9; i++) {
			if (board[row][i] == num)
				return false;
			if (board[i][col] == num)
				return false;
			if (board[(3 * (row / 3)) + (i / 3)][(3 * (col / 3)) + (i % 3)] == num)
				return false;
		}
		return true;
	}

	private boolean solve(int[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				if (board[row][col] == 0) {
					for (int num = 1; num <= 9; num++) {
						if (valid(board, row, col, num)) {
							board[row][col] = num;
							if (solve(board)) {
								return true;
							} else {
								board[row][col] = 0;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		SudokuSolver obj = new SudokuSolver();

		int[][] board = new int[9][9];

		obj.solve(board);

		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				System.out.print(board[row][col] + " ");
			}
			System.out.println();
		}
	}
}
