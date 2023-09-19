package EffectiveRecursive;

import java.util.Scanner;

//냅색
//12865
public class effective_Recur_4 {

    static int n;
    static int b;
    static int[][] arr;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) {
        effective_Recur_4 T = new effective_Recur_4();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        b = sc.nextInt();
        arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        T.recur(0,0,0);
        System.out.println(answer);
    }

    public void recur(int idx, int weight, int value){

        if(weight > b) return;
        if(idx == n){
            answer = Math.max(answer,value);
            return;
        }

        recur(idx+1, weight+arr[idx][0], value + arr[idx][1]);  //물건을 넣은 경우
        recur(idx+1, weight, value);  //물건을 안 넣은 경우
    }
}
