package recursion.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsequenceWithSum {

	private void findAllSubsequencesWithsum(List<List<Integer>> result, ArrayList<Integer> ans, List<Integer> nums,
			int index, int sum, int target) {
		if (index == nums.size()) {
			if (sum == target) {
				result.add(ans);
			}
			return;
		}

		findAllSubsequencesWithsum(result, new ArrayList<>(ans), nums, index + 1, sum, target);
		ans.add(nums.get(index));
		findAllSubsequencesWithsum(result, new ArrayList<>(ans), nums, index + 1, sum + nums.get(index), target);
	}

	public static void main(String[] args) {
		SubsequenceWithSum obj = new SubsequenceWithSum();
		List<Integer> nums = Arrays.asList(1, 2, 1);
		int target = 2;
		List<List<Integer>> result = new ArrayList<>();
		obj.findAllSubsequencesWithsum(result, new ArrayList<Integer>(), nums, 0, 0, target);
		for (List<Integer> ans : result) {
			System.out.println(ans);
		}
	}

}
