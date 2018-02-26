package com.crp.arrays;

/**
 * @author Rajendra
 *
 */
public class RemovalOfDuplicatesFromArray {

	public static void main(String[] args) {
int[] array = { 1, 1, 2, 2, 3, 3, 5, 5, 8, 9, 9,5,2,4,5,6 };
		

		for (int i = 0; i<array.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j<i; j++) {
				if (array[i] == array[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				System.out.print(array[i] + " ");
			}
		
	}
 

	}

}
