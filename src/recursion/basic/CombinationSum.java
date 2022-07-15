package recursion.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	private void findCombinations(List<List<Integer>> result, ArrayList<Integer> ans, List<Integer> nums, int index, int target) {
		if(index == nums.size()) {
			if(target == 0) {
				result.add(ans);
			}
			return;
		}

		findCombinations(result, new ArrayList<>(ans), nums, index+1, target);
		if(nums.get(index) <= target) {
			ans.add(nums.get(index));
			findCombinations(result, new ArrayList<>(ans), nums, index, target - nums.get(index));
		}
	}

	public static void main(String[] args) {
		CombinationSum obj = new CombinationSum();
		List<Integer> nums = Arrays.asList(1, 2, 1);
		int target = 7;
		List<List<Integer>> result = new ArrayList<>();
		obj.findCombinations(result, new ArrayList<Integer>(), nums, 0, target);
		for (List<Integer> ans : result) {
			System.out.println(ans);
		}
	}

}
