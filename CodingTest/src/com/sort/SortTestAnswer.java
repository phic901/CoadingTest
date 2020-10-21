package com.sort;

public class SortTestAnswer {
	
	//https://ict-nroo.tistory.com/52
	
	private static int[] targetArr = {4,3,5,1,2};
	
	
	public static void main(String args[]) {
		
		try {
			printArr(targetArr);
			bubbleSortDESC(targetArr);
			printArr(targetArr);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	private static void selectionSortASC(int[] targetArr) {
		
		int targetArrLength = targetArr.length;
		int stdIdx;
		
		for(int i=0;i<targetArrLength-1;i++) {
			stdIdx = i;
			for(int k=i+1;k<targetArrLength;k++) {
				if(targetArr[k] < targetArr[stdIdx])
					stdIdx = k;
			}
			swap(targetArr, i, stdIdx);
		}
		
	}
	
	private static void selectionSortDESC(int[] targetArr) {
		
		int targetArrLength = targetArr.length;
		int stdIdx;
		
		for(int i=0;i<targetArrLength-1;i++) {
			stdIdx = i;
			for(int k=i+1;k<targetArrLength;k++) {
				if(targetArr[k] > targetArr[stdIdx])
					stdIdx = k;
			}
			swap(targetArr, i, stdIdx);
		}
		
		
		
	}
	
	private static void bubbleSortASC(int[] targetArr) {
		
		int targetArrLength = targetArr.length;
		
		for(int i=0;i<targetArrLength-1;i++) {
			for(int k=0;k<targetArrLength-i-1;k++) {
				if(targetArr[k] > targetArr[k+1])
					swap(targetArr, k, k+1);
			}
		}
	}
	
	private static void bubbleSortDESC(int[] targetArr) {
		
		int targetArrLength = targetArr.length;
		
		for(int i=0;i<targetArrLength-1;i++) {
			for(int k=0;k<targetArrLength-i-1;k++) {
				if(targetArr[k] < targetArr[k+1]) {
					swap(targetArr, k, k+1);
				}
			}
		}
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
