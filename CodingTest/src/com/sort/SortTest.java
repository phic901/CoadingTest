package com.sort;

public class SortTest {
	
	//https://ict-nroo.tistory.com/52
	
	private static int[] targetArr = {4,3,5,1,2};
	
	
	public static void main(String args[]) {
		
		try {
			printArr(targetArr);
			selectionSortASC(targetArr);
			printArr(targetArr);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	private static void selectionSortASC(int[] targetArr) {
		
	}
	
	private static void selectionSortDESC(int[] targetArr) {
		
	}
	
	private static void bubbleSortASC(int[] targetArr) {
		
	}
	
	private static void bubbleSortDESC(int[] targetArr) {
		
	}
	
	
	
	private static void printArr(int[] targetArr) {
		for(int a:targetArr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	
	
	private static void swap(int[] targetArr, int idx1, int idx2) {
		int tmp = targetArr[idx1];
		targetArr[idx1] = targetArr[idx2];
		targetArr[idx2] = tmp;
	}

	
	

}
