package BruteForce;

import java.util.Scanner;

//모이기
//1090
//미완
public class gathering {
    public void solution(int n, int[][] arr){
        int[][] range = new int[n][n];
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                range[i][j] = arr[i][0] - arr[j][0] + arr[i][1] - arr[j][1];
            }
        }
        for(int i=1; i<=n; i++){

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
