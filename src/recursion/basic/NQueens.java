package recursion.basic;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	private List<String> construct(char[][] board) {
		List<String> out = new ArrayList<String>();
		for (int row = 0; row < board.length; row++) {
			out.add(new String(board[row]));
		}
		return out;
	}

	public void getBoards(List<List<String>> boards, char[][] board, int N, int col, int[] leftRow, int[] leftUpper,
			int[] leftBottom) {
		if (col == N) {
			boards.add(construct(board));
			return;
		}

		for (int row = 0; row < N; row++) {
			if (leftRow[row] == 0 && leftUpper[N - 1 + (col - row)] == 0 && leftBottom[col + row] == 0) {
				board[row][col] = 'Q';
				leftRow[row] = 1;
				leftUpper[N - 1 + (col - row)] = 1;
				leftBottom[col + row] = 1;
				getBoards(boards, board, N, col + 1, leftRow, leftUpper, leftBottom);
				board[row][col] = '.';
				leftRow[row] = 0;
				leftUpper[N - 1 + (col - row)] = 0;
				leftBottom[col + row] = 0;
			}
		}

	}

	public static void main(String[] args) {
		int N = 4;
		NQueens obj = new NQueens();

		List<List<String>> boards = new ArrayList<>();

		int[] leftRow = new int[N];
		int[] leftUpper = new int[2 * N - 1];
		int[] leftBottom = new int[2 * N - 1];

		char[][] board = new char[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = '.';
			}
		}

		obj.getBoards(boards, board, N, 0, leftRow, leftUpper, leftBottom);
		System.out.println(boards);
	}
}