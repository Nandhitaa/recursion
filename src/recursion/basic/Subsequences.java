package recursion.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequences {

	public void findAllSubsequences(List<List<Integer>> result, List<Integer> ans, List<Integer> nums, int index) {
		if (index == nums.size()) {
			result.add(ans);
			return;
		}
		findAllSubsequences(result, new ArrayList<Integer>(ans), nums, index + 1);
		ans.add(nums.get(index));
		findAllSubsequences(result, new ArrayList<Integer>(ans), nums, index + 1);
	}

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3);
		List<List<Integer>> result = new ArrayList<>();
		Subsequences obj = new Subsequences();
		obj.findAllSubsequences(result, new ArrayList<Integer>(), nums, 0);
		for (List<Integer> ans : result) {
			System.out.println(ans);
		}
	}

}
