package recursion.basic;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {

	private String findPermutation(List<Integer> numbers, int fact, int k) {
		String result = "";
		k = k - 1;
		while (true) {
			int index = k / fact;
			result += numbers.get(index);
			numbers.remove(index);
			if (numbers.size() == 0)
				break;
			k = k % fact;
			fact = fact / numbers.size();

		}
		return result;
	}

	public static void main(String[] args) {
		KthPermutation obj = new KthPermutation();
		int n = 4;
		int k = 1;
		int fact = 1;
		List<Integer> numbers = new ArrayList<Integer>();
		int index = 1;
		for (index = 1; index < n; index++) {
			numbers.add(index);
			fact = fact * index;
		}
		numbers.add(n);

		String result = obj.findPermutation(numbers, fact, k);
		System.out.println(result);

	}
}