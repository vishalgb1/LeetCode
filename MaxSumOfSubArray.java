/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
A subarray is a contiguous part of an array.
*/

package com.leetcode;

public class MaxSumOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		// int[] nums = {1};
		// int[] nums = {5,4,-1,7,8};

		SolutionClass s = new SolutionClass();
		System.out.println(s.maxSubArray(nums));

	}

}

class SolutionClass {
	public int maxSubArray(int[] nums) {

		int maxSum = 0;
		Boolean booleanValue = false;
		int negativeValue = 0;
		int currSum = 0;

		if (nums.length == 1)
			return nums[0];

		for (int i = 0; i < nums.length; i++) {
			currSum = currSum + nums[i];
			if (currSum < 0)
				currSum = 0;

			if (nums[i] < 0) {
				if (negativeValue == 0 || nums[i] > negativeValue) {
					negativeValue = nums[i];
				}
			} else
				booleanValue = true;

			if (currSum > maxSum) {
				maxSum = currSum;
			}
		}
		return booleanValue ? maxSum : negativeValue;

	}
}