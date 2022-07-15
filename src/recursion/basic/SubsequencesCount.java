package recursion.basic;

import java.util.Arrays;
import java.util.List;

public class SubsequencesCount {

	public int findSubsequencesCountWithSum(List<Integer> nums, int index, int sum, int target) {
		if (index == nums.size()) {
			if (sum == target) {
				return 1;
			}
			return 0;
		}

		int left = findSubsequencesCountWithSum(nums, index + 1, sum, target);
		int right = findSubsequencesCountWithSum(nums, index + 1, sum + nums.get(index), target);

		return left + right;
	}

	public static void main(String[] args) {
		SubsequencesCount obj = new SubsequencesCount();
		List<Integer> nums = Arrays.asList(1, 2, 1);
		int target = 2;
		int count = obj.findSubsequencesCountWithSum(nums, 0, 0, target);
		System.out.println(count);
	}

}
