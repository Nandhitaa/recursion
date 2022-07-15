package recursion.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum2 {

	private void findCombinations(List<List<Integer>> result, ArrayList<Integer> ans, List<Integer> nums, int index, int target) {
		if(index == nums.size()) {
			if(target == 0) {
				result.add(ans);
			}
			return;
		}

		for(int i = index; i<nums.size(); i++) {
			if(i > index && nums.get(i) == nums.get(i-1)) continue;
			if(nums.get(i) > target) break;
			
			ans.add(nums.get(i));
			findCombinations(result, new ArrayList<>(ans), nums, i+1, target-nums.get(i));
		}
	}

	public static void main(String[] args) {
		CombinationSum2 obj = new CombinationSum2();
		List<Integer> nums = Arrays.asList(1, 2, 1, 2, 2);
		int target = 7;
		Collections.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		obj.findCombinations(result, new ArrayList<Integer>(), nums, 0, target);
		for (List<Integer> ans : result) {
			System.out.println(ans);
		}
	}

}
