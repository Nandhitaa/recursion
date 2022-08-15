package recursion.basic;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning {

	private boolean isPalindrome(String input) {
		for (int index = 0; index < input.length() / 2; index++) {
			if (input.charAt(index) != input.charAt(input.length() - index - 1)) {
				return false;
			}
		}
		return true;
	}

	private void palindromes(String input, List<List<String>> result, List<String> ans, int currentPartitionIndex) {
		if (currentPartitionIndex == input.length()) {
			result.add(ans);
			return;
		}
		for (int nextPartitionIndex = currentPartitionIndex; nextPartitionIndex < input.length(); nextPartitionIndex++) {
			if (isPalindrome(input.substring(currentPartitionIndex, nextPartitionIndex + 1))) {
				ans.add(input.substring(currentPartitionIndex, nextPartitionIndex + 1));
				palindromes(input, result, new ArrayList<>(ans), nextPartitionIndex + 1);
				ans.remove(ans.size() - 1);
			} else {
				continue;
			}
		}
	}

	public static void main(String[] args) {
		PalindromePartioning obj = new PalindromePartioning();

		String input = "bbaabb";
		List<List<String>> result = new ArrayList<>();
		obj.palindromes(input, result, new ArrayList<>(), 0);
		System.out.println(result);
	}
}
