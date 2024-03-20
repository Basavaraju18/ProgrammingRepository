package com.mrk.innoapps;



import java.util.ArrayList;
import java.util.List;

public class ListSorting {  //bubblesorting

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(5);
		myList.add(2);
		myList.add(8);
		myList.add(1);
		myList.add(3);

		System.out.println("Original List: " + myList);

		// Sorting the list using Bubble Sort
		bubbleSort(myList);

		System.out.println("Sorted List: " + myList);
	}

	private static void bubbleSort(List<Integer> list) {
		int n = list.size();
		boolean swapped;

		do {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (list.get(i - 1) > list.get(i)) {
					// Swap elements if they are in the wrong order
					int temp = list.get(i - 1);
					list.set(i - 1, list.get(i));
					list.set(i, temp);
					swapped = true;
				}
			}
		} while (swapped);
	}
}

