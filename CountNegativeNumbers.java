package com.leetcode;

/*Find the number of negative numbers in a column-wise / row-wise sorted matrix M[][]. Suppose M has n rows and m columns.*/


class CountNegativeNumbers {
	
	/*static int countNegative(int M[][], int n, int m) {
		int countNegative = 0;
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				if(M[i][j] < 0) {
					countNegative ++;
				}
			}
		}		
		return countNegative;
	}*/
	
	static int countLastNegativeIndex(int M[], int start, int end) {
		int count = 0;
		int mid = start + (end - start) / 2;
		if (M[mid] < 0) {
			if ((mid + 1) < M.length && M[mid + 1] >= 0)
				return mid;
			count = countLastNegativeIndex(M, mid + 1, end);
		} else {
			count = countLastNegativeIndex(M, 0, mid - 1);
		}
		return count;
	}

	static int countNegative(int M[][], int n, int m) {
		int count = 0;
		int lastNegative = m - 1;

		for (int i = 0; i < n; i++) {
			if (M[i][0] >= 0)
				break;

			lastNegative = countLastNegativeIndex(M[i], 0, m - 1);
			count = count + lastNegative + 1;
		}
		return count;
	}

	public static void main(String[] args) {
		int M[][] = {	{ -3, -2, -1, 1 }, 
						{ -2, 2, 3, 4 }, 
						{ 4, 5, 7, 8 } 
					};
		System.out.println(countNegative(M, 3, 4));
	}
}

