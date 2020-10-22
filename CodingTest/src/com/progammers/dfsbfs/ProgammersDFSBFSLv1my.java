package com.progammers.dfsbfs;

/**

* refer - https://lkhlkh23.tistory.com/74

코딩테스트 연습 > 깊이/너비 우선 탐색(DFS/BFS) > 타겟 넘버

문제 설명
n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 
예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3

사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 
적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.

제한사항
주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
각 숫자는 1 이상 50 이하인 자연수입니다.
타겟 넘버는 1 이상 1000 이하인 자연수입니다


입출력 예
numbers				target	return
[1, 1, 1, 1, 1]		3		5

*/

import java.util.*;
public class ProgammersDFSBFSLv1my {
	
	private static TreeSet<String> calStringList = new TreeSet<String>();
	
	public static void main(String args[]) {
		
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		try {
			ProgammersDFSBFSLv1my ProgammersHashLv1 = new ProgammersDFSBFSLv1my();
			System.out.println(ProgammersHashLv1.solution(numbers, target));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        List<String> arr = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for(int i=0;i<numbers.length;i++) {
        	arr.add("+");
        	arr.add("-");
        }
        
        permutation(arr, result, arr.size(), numbers.length);
        
        for(String calString:calStringList) {
        	
        	int numRet = 0;
        	for(int i=0;i<calString.length();i++) {
        		if(calString.charAt(i) == '+') {
        			numRet += numbers[i];
        		}else {
        			numRet -= numbers[i];
        		}
        	}
        	System.out.println(numRet);
        	if(numRet == target)
        		answer++;
        }
        return answer;
    }
    
    
    private static void permutation(List<String> arr, List<String> result, int n, int r) {
    	if(r == 0) {
    		addCal(result);
    		return;
    	}
    	
    	for(int i=0;i<n;i++) {
    		result.add(arr.remove(i));
    		permutation(arr, result, n-1, r-1);
    		arr.add(i, result.remove(result.size()-1));
    	}
    }
    private static void addCal(List<String> calSeqList) {
    	StringBuilder sb = new StringBuilder();
    	for(String calSeq:calSeqList) {
    		sb.append(calSeq);
    	}
    	calStringList.add(sb.toString());
    }
		
	
	
	
	
}
	



