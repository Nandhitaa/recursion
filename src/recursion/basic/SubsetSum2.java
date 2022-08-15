package recursion.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum2 {

	private void subsets(List<Integer> input, List<List<Integer>> result, List<Integer> ans, int size) {
		result.add(new ArrayList<>(ans));
		for (int i = size; i < input.size() - 1; i++) {
			if (i > size && input.get(i) == input.get(i - 1)) {
				continue;
			}
			ans.add(input.get(i));
			subsets(input, result, ans, i + 1);
			ans.remove(ans.size() - 1);
		}
	}

	public static void main(String[] args) {
		SubsetSum2 obj = new SubsetSum2();
		List<Integer> input = Arrays.asList(1, 2, 2, 2, 3, 3);
		List<List<Integer>> result = new ArrayList<>();
		obj.subsets(input, result, new ArrayList<Integer>(), 0);
		System.out.println(result);
	}
}
