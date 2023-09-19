package DP_TopDown;

import java.util.Arrays;
import java.util.Scanner;

//냅색
//12865
public class Main {

    static int n;
    static int b;
    static int[][] arr;
    static int[][] dp;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        b = sc.nextInt();

        dp = new int[n][100010];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }

        arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int answer =T.recur(0,0);
        System.out.println(answer);
    }

    public int recur(int idx, int weight){

        if(weight > b) return Integer.MIN_VALUE;
        if(idx == n){
            return 0;
        }
        if(dp[idx][weight] != -1){
            return dp[idx][weight];
        }

        dp[idx][weight] = Math.max(recur(idx+1, weight+arr[idx][0]) + arr[idx][1], recur(idx+1, weight));

        return dp[idx][weight];

    }
}
