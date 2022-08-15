package recursion.basic;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {
	private void solve(int size, List<String> result, String ans, int row, int col) {
		if(row == size-1 && col == size-1) {
			result.add(ans);
			return;
		}
		if(row <0 || col <0 || row > size || col > size) return;
		solve(size, result, ans+"D", row+1, col);
		solve(size, result, ans+"R", row, col+1);
	}
	public static void main(String[] args) {
		RatInMaze obj = new RatInMaze();
		List<String> result = new ArrayList<String>();
		obj.solve(3, result, "", 0, 0);
		System.out.println(result);
	}
}
