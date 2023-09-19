package EffectiveRecursive;

import java.util.Scanner;

//요리사의 고민
//2961
public class effective_Recur_1 {
    static int n;
    static int[][] arr;
    static int answer = Integer.MAX_VALUE;

    public void recur(int idx, int sin, int sun, int use){
        if(idx == n){
            if(use >0){
                answer = Math.min(answer, Math.abs(sin - sun));
            }
            return;
        }

        recur(idx+1, sin*arr[idx][0],sun+arr[idx][1], use+1);   //재료를 쓰는 경우
        recur(idx+1, sin, sun, use);    //재료를 안쓰는 경우

    }

    public static void main(String[] args) {
        effective_Recur_1 T = new effective_Recur_1();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        T.recur(0,1,0, 0);
        System.out.println(answer);
    }
}