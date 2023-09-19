package EffectiveRecursive;

import java.util.Scanner;

//상담
//14501
public class effective_Recur_3 {

    static int n;
    static int[][] arr;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) {
        effective_Recur_3 T = new effective_Recur_3();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        T.recur(0,0);
        System.out.println(answer);
    }

    public void recur(int idx, int price){

        if(idx == n){
            answer = Math.max(answer, price);
            return;
        }
        if(idx > n){
            return;
        }

        recur(idx+arr[idx][0], price+arr[idx][1]);  //상담을 하는 경우
        recur(idx+1,price);   //상담을 안하는 경우

    }
}
