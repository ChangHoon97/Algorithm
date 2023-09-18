package AccumulateSum;

import java.util.Scanner;

//수열 가장 크게 만들기
//1912
public class biggestSequence {

    public int solution(int n, int[] list){
        int answer = Integer.MIN_VALUE;
        int[] prefix = new int[n+1];
        for(int i=0; i<n; i++){
            prefix[i+1]= Math.max(prefix[i]+list[i],list[i]);
        }

        for(int i=1; i<n+1; i++){
            answer = Math.max(answer,prefix[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        biggestSequence T = new biggestSequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i=0; i<n; i++){
            list[i] = sc.nextInt();
        }

        System.out.println(T.solution(n,list));
    }
}
