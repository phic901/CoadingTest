package com.sort;

import java.util.*;

/**
 * 순열/재귀 연습
 * https://codevang.tistory.com/297?category=859681
 */
public class PermutationRecursionPracticeTest {
	
	
	private static TreeSet<Integer> createdNumList = new TreeSet<>();
	
	public static void main(String[] args) {
		
		String numbers = "371";
		
		List<String> arr = new ArrayList<>();
		for(char number:numbers.toCharArray()) {
			arr.add(String.valueOf(number));
		}
		
		List<String> result = new ArrayList<>();
		for(int i=1; i<=arr.size(); i++) {
			result = new ArrayList<>();
			recursion(arr, result, arr.size(), i);
		}
		
		int primeNumCnt = 0;
		for(int num:createdNumList) {
			if(isPrime(num)) {
				System.out.println(num);
				primeNumCnt++;
			}
		}
		
		System.out.println("primeNumCnt : " + primeNumCnt);
		
		
	}
	
	private static void recursion(List<String> arr, List<String> result, int n, int r) {
		
		
		//System.out.println("recursion("+arr.toString().replace(" ", "")+" , "+ result.toString().replace(" ", "") + ", " + n + " , " + r  +")");
		
		if(r == 0) {
			addNum(result);
			return;
		}
		
		for(int i=0;i<n;i++) {
			result.add(arr.remove(i));
			recursion(arr, result, n-1, r-1);
			arr.add(i, result.remove(result.size()-1));
		}
		
	}
	
	
	private static void addNum(List<String> numSeqList) {
		StringBuilder sb = new StringBuilder();
		for(String numSeq:numSeqList) {
			sb.append(numSeq);
		}
		String numRet = sb.toString();
		if(!numRet.startsWith("0")) {
			createdNumList.add(Integer.parseInt(numRet));
		}
	}
	
	/**
	 * 소수 판별
	 * 
	 * @param n : 판별할 숫자
	 * @return
	 */
	private static boolean isPrime(int n) {

		int i;
		int sqrt = (int) Math.sqrt(n);

		// 2는 유일한 짝수 소수
		if (n == 2)
			return true;

		// 짝수와 1은 소수가 아님
		if (n % 2 == 0 || n == 1)
			return false;

		// 제곱근까지만 홀수로 나눠보면 됨
		for (i = 3; i <= sqrt; i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;
	}
	
	
	
	
	
	
	

}
