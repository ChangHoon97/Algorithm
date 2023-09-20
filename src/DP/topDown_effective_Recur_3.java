package DP;

import java.util.Arrays;
import java.util.Scanner;

//상담
//14501
//DP(메모리제이션)
public class topDown_effective_Recur_3 {

    static int n;
    static int[][] arr;
    static int[] dp;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) {
        topDown_effective_Recur_3 T = new topDown_effective_Recur_3();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        T.recur(0);
        Arrays.sort(dp);
        System.out.println(dp[n]);
    }

    public int recur(int idx){

        if(idx == n){
            return 0;
        }
        if(idx > n){
            return Integer.MIN_VALUE;
        }

        if(dp[idx] != -1){  //이미 저장되어 있는 경우
            return dp[idx];
        }

        //상담을 받거나, 안받거나, 그 중에서 더 많은 돈을 버는 경우를 내 DP 테이블에 저장하겠다.
        dp[idx] = Math.max(recur(idx+arr[idx][0]) + arr[idx][1], recur(idx+1));

        return dp[idx];

    }
}
