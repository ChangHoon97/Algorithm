package AccumulateSum;

import java.util.Arrays;
import java.util.Scanner;

// 2차원 누적합
//11660
//틀림
public class two_dimensional_sequence {

    public void solution(int n, int m, int[][] coordinate, int[][] list){

        int[][] prefix = new int[n+1][n+1];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                prefix[i+1][j+1] = prefix[i][j+1] + prefix[i+1][j] - prefix[i][j] + list[i][j];

            }
        }

//        for(int i =0; i<n+1; i++){
//
//            System.out.println(Arrays.toString(prefix[i]));
//
//        }

        for(int i=0; i<m; i++){
            int answer = prefix[coordinate[i][2]][coordinate[i][3]] - prefix[coordinate[i][0]-1][coordinate[i][3]] - prefix[coordinate[i][2]][coordinate[i][1]-1] + prefix[coordinate[i][0]-1][coordinate[i][1]-1];
            System.out.println(answer);
        }

    }

    public static void main(String[] args) {
        two_dimensional_sequence T = new two_dimensional_sequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] list = new int[n][n];
        int[][] coordinate = new int[m][4];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                list[i][j] =sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 4; j++) {
                coordinate[i][j] = sc.nextInt();
            }
        }

        T.solution(n,m,coordinate, list);
    }
}
