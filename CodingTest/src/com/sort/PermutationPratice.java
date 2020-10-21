package com.sort;

public class PermutationPratice {

	//출처: https://gorakgarak.tistory.com/522 [먹거리 만드는 열정맨 고락가락]

	public static void main(String args[]) {
		
		int[] arr = {1,2,3,4};
		
		perm(arr, 0, 4, 4);
		
		
	}
	
	private static void perm(int[] arr, int depth, int n, int k) {
		// 한번 depth 가 k로 도달하면 사이클이 돌았음. 출력함.
		if (depth == k) {
			print(arr);
			return;
		}
		
		for (int i=depth; i<n; i++) {
			swap(arr, i, depth);
			perm(arr, depth + 1, n, k);
			swap(arr, i, depth);
		}
	}
	
	private static void print(int[] arr) {
		for(int n:arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	
	private static void swap(int[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}

		

}
