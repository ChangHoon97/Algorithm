package EffectiveRecursive;

import java.util.Scanner;

//요리사의 복잡한 고민
//19942
public class effective_Recur_2 {
    static int n;
    static int[][] arr;
    static int[] standard = new int[4];
    static int answer = Integer.MAX_VALUE;

    public void recur(int idx, int a, int b, int c, int d, int e){
        if(idx == n){
            if(a >= standard[0] && b >= standard[1] && c >= standard[2] && d >= standard[3] ){
                answer = Math.min(answer, e);
            }
            return;
        }

        recur(idx+1, a+arr[idx][0], b+arr[idx][1], c+arr[idx][2], d+arr[idx][3], e+arr[idx][4]);   //재료를 쓰는 경우
        recur(idx+1, a, b, c, d, e);    //재료를 안쓰는 경우

    }

    public static void main(String[] args) {
        effective_Recur_2 T = new effective_Recur_2();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0; i<4; i++){
            standard[i] = sc.nextInt();
        }
        arr = new int[n][5];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
            arr[i][3] = sc.nextInt();
            arr[i][4] = sc.nextInt();
        }
        T.recur(0,0,0, 0, 0, 0);
        System.out.println(answer);
    }
}