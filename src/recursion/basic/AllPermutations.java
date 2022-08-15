package recursion.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPermutations {

	private void swap(List<Integer> input, int index1, int index2) {
		int temp = input.get(index1);
		input.set(index1, input.get(index2));
		input.set(index2, temp);
	}

	private void getPermutations(List<Integer> input, List<List<Integer>> result, int index) {

		if (index == input.size()) {
			result.add(new ArrayList<>(input));
			return;
		}

		for (int elem = index; elem < input.size(); elem++) {
			swap(input, index, elem);
			getPermutations(input, result, index + 1);
			swap(input, index, elem);
		}
	}

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1, 2, 3);
		AllPermutations obj = new AllPermutations();
		List<List<Integer>> result = new ArrayList<>();
		obj.getPermutations(input, result, 0);
		System.out.println(result);
	}

}