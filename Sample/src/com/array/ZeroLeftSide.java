package com.array;

final class ZeroLeftSide {

	final void arraySwapping() 
	{
		int[] arr = {0, 1, 0, 2, -22, 0, 3};

		int nonZeroIndex = arr.length - 1;

		for (int i = arr.length-1; i >= 0; i--) 
		{
			if (arr[i] != 0) 
			{
				int temp = arr[i];
				arr[i] = arr[nonZeroIndex];  
				arr[nonZeroIndex] = temp;
				nonZeroIndex--;
			}
		}

		for (int j = 0; j < arr.length; j++) 
		{
			System.out.print(arr[j] + " ");
		}
	}
	public static void main(String[] args) {
		ZeroLeftSide z1 = new ZeroLeftSide();
		z1.arraySwapping();
	}
}

/**Iteration 1 (i = 6, nonZeroIndex = 6):

arr[6] is 3, which is non-zero.
Swap arr[6] with arr[6] (no change).
Decrement nonZeroIndex to 5.
Iteration 2 (i = 5, nonZeroIndex = 5):

arr[5] is 0, which is zero (no action).
Decrement i to 4.
Iteration 3 (i = 4, nonZeroIndex = 5):

arr[4] is -22, which is non-zero.
Swap arr[4] with arr[5], resulting in {0, 1, 0, 2, 0, -22, 3}.
Decrement nonZeroIndex to 4.
Iteration 4 (i = 3, nonZeroIndex = 4):

arr[3] is 2, which is non-zero.
Swap arr[3] with arr[4], resulting in {0, 1, 0, 0, 2, -22, 3}.
Decrement nonZeroIndex to 3.
Iteration 5 (i = 2, nonZeroIndex = 3):

arr[2] is 0, which is zero (no action).
Decrement i to 1.
Iteration 6 (i = 1, nonZeroIndex = 3):

arr[1] is 1, which is non-zero.
Swap arr[1] with arr[3], resulting in {0, 0, 1, 0, 2, -22, 3}.
Decrement nonZeroIndex to 2.
Iteration 7 (i = 0, nonZeroIndex = 2):

arr[0] is 0, which is zero (no action).
Decrement i to -1.
The loop terminates as i becomes less than zero. After these iterations, the array is transformed to {0, 0, 1, 0, 2, -22, 3}, where all non-zero elements are on the left side, and the remaining elements are zeros.



*/



