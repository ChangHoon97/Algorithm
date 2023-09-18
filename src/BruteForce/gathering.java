package BruteForce;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//모이기
//1090
//미완
public class gathering {
    public void solution(int n, int[][] arr){

        //모든 x값과 y값 추출
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0; i<n; i++){
            x[i] = arr[i][0];
            y[i] = arr[i][1];
        }

        int[] answer = new int[n];
        int[] sum = new int[n];

        //모든 x,y값과 각 점들의 거리 계산
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                sum[i] = Math.abs(x[i] - arr[j][0]) + Math.abs(y[j] - arr[j][1]);
            }

        }

    }

    public static void main(String[] args) {
        gathering T = new gathering();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        T.solution(n,arr);
    }
}
