package com.LeetCode;

public class MergeSortedArray {
    public static void main(String args[]) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(new int[]{0}, 0, new int[]{1}, 1);
    }

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {


        class RemoveElements {
            public static void main(String[] args) {
                RemoveElements removeElements = new RemoveElements();
                int printValue = removeElements.removeElement(new int[]{1,2,3,4},3);
                System.out.print(printValue);
            }

            public int removeElement(int[] nums, int val) {
                int count = 0;
                for (int i=0;i<nums.length;i++){
                    if(nums[i] == val){
                        nums[count] = nums[i];
                        count = count + 1;
                    }
                }
                return count;
            }
        }



/*

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.



Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).


Constraints:

0 <= nums.length <= 100
0 <= nums[i] <= 50
0 <= val <= 100

*/        int firstArray = 0;
        if (m > 0)
               firstArray = m - 1;
        int secondArray = n - 1;
        int combinedArray = m + n - 1;
        while(secondArray >= 0){
            if(firstArray >= 0) {
                if (nums1[firstArray] < nums2[secondArray]) {
                    nums1[combinedArray] = nums2[secondArray];
                    secondArray = secondArray - 1;
                    combinedArray = combinedArray - 1;
                } else {
                    nums1[combinedArray] = nums1[firstArray];
                    firstArray = firstArray - 1;
                    combinedArray = combinedArray - 1;
                }
            }

            }








        return nums1;

    }
}