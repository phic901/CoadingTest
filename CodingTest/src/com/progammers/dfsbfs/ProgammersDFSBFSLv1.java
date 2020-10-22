package com.progammers.dfsbfs;

/**

* refer - https://lkhlkh23.tistory.com/74
* refer - https://saltae.tistory.com/11

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

public class ProgammersDFSBFSLv1 {
	
	
	static int total_Len;
	static int targetNum;
    static int count;
	
	public static void main(String args[]) {
		
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		try {
			ProgammersDFSBFSLv1 ProgammersHashLv1 = new ProgammersDFSBFSLv1();
			System.out.println(ProgammersHashLv1.solution(numbers, target));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
    public int solution(int[] numbers, int target) {
    	total_Len = numbers.length;
        targetNum = target;
        count = 0;
        DFS(0,0,numbers);
        int answer = count;
        return answer;
    }

    public static void DFS(int flag, int sum, int[] compNum){
    	System.out.println("flag : " + flag + " / sum : " + sum);
        if(flag==total_Len){
            if(targetNum==sum){
                count++;
            }
            System.out.println("--------------------------------");
            return;
        }
        int tmpNum = compNum[flag];
        DFS(flag+1, sum+tmpNum, compNum);
        DFS(flag+1, sum-tmpNum, compNum);
    }		
}
	



