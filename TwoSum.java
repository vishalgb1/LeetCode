/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/

package com.leetcode;

import java.util.*;

class TwoSum {

	public static void main(String args[]) {
		Solution s = new Solution();
		int arr[] = { 2, 7, 11, 15 };
		int target = 9; // Output: [0,1]
		/*
		 int arr[] = {3,2,4}; int target = 6; //Output: [1,2] 
		 int arr[] = {3,3}; int target = 6; */   // Output: [0,1]
		int[] pair = s.twoSum(arr, target);
		System.out.println(Arrays.toString(pair));
	}
}

class Solution {

	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			hashMap.put(nums[i], i);
		}
		int[] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(target - nums[i]) && i != hashMap.get(target - nums[i])) {
				int firstElement = hashMap.get(target - nums[i]);
				int secondElement = i;
				arr[0] = firstElement;
				arr[1] = secondElement;
			}
		}
		return arr;
	}
}