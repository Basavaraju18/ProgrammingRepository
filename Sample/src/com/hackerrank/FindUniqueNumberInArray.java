package com.hackerrank;

public class FindUniqueNumberInArray {

	private static void method1() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}

	private static  void method2() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5 ; j++) {
				if(i == 0 || i == 4 || j == 0 || j == 4) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		method1();
		System.out.println("========");
		method2();
		int[] arr = {1, 2, 3, 4, 3, 2, 1, 2, 3};

		boolean flag = false;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}

			}
			if(count == 1) {
		//				System.out.println(arr[i]);
			}
		}
	}
}