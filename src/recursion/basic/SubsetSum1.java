package recursion.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetSum1 {

	private void subsetSum(List<Integer> input, List<Integer> result, int index, int sum) {
		if(index == input.size()) {
			result.add(sum);
			return;
		}
		subsetSum(input, result, index+1, sum);
		subsetSum(input, result, index+1, sum + input.get(index));
	}

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(3,1,2);
		SubsetSum1 obj = new SubsetSum1();
		List<Integer> result = new ArrayList<Integer>();
		obj.subsetSum(input, result, 0, 0);
		Collections.sort(result);
		System.out.println(result);
	}
}
