package com.leetcode;

import java.util.HashSet;

class ConsecutiveSequence{

	public int sequenceLength(int nums[]) {
		int maxCounter = 0;
        
		if (nums.length == 0)
			return 0;


		HashSet<Integer> hashset = new HashSet<Integer>();
		for (int i = 0; i < nums.length; ++i) {
			hashset.add(nums[i]);
		}

		for (int i = 0; i < nums.length; ++i) {
			if (!hashset.contains(nums[i] - 1)) {
				int j = nums[i];
				while (hashset.contains(j))
					j = j + 1;
				if (maxCounter < j - nums[i])
					maxCounter = j - nums[i];
			}
		}
		return maxCounter;
	}
}

public class LengthConsecutiveSequence {
	public static void main(String args[]) {
		ConsecutiveSequence c = new ConsecutiveSequence();
		int arr[] = {100,4,200,1,2,3};
		System.out.println(c.sequenceLength(arr) + 1);
	}
}
