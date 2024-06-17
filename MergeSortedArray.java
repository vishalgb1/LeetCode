package com.LeetCode;

public class MergeSortedArray {
    public static void main(String args[]) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(new int[]{1, 2, 3, 0, 0, 0}, 6, new int[]{2, 5, 6}, 3);
    }

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int firstArray = m - 1;
        int secondArray = n - 1;
        int combinedArray = m + n - 2;
        while(secondArray >= 0){
            if(nums1[firstArray] < nums2[secondArray]) {
                 nums1[combinedArray] = nums2[secondArray];
                secondArray = secondArray - 1;
                combinedArray = combinedArray - 1;
            }
            else if (nums1[firstArray] > nums2[secondArray])
            {
                nums1[combinedArray] = nums1[firstArray];
                firstArray = firstArray - 1;
                combinedArray = combinedArray - 1;
            }

            }








        return nums1;

    }
}