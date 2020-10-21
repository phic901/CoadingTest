package com.sort;

public class Dfs {
	
	
	private static int answer = 0;
	
	public static void main(String args[]) {
		int[] numbers = {1,2,3,4,5,6};
		int target = 15;
		dfs(numbers, target, 0);
		
		System.out.println("answer : " + answer);
	} 
	
	
	public static void dfs(int[] numbers, int target, int index) {
		
		if(index == numbers.length) {
			int sum = 0;
			for(int num:numbers) {
				sum+= num;
			}
			if(sum == target) {
				answer++;
			}
		}else {
			numbers[index] *= 1;
			dfs(numbers, target, index+1);
			
			numbers[index] *= -1;
			dfs(numbers, target, index+1);
		}
	}

}
