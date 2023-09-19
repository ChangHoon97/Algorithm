package Recrusive;

//숫자야구
//2503

import java.util.Scanner;

public class numberBaseball_Recur {
    static int answer =0;
    static int n =0;
    static int[][] arr = new int[n][3];

    public int solution(int number, int hint_indx, int[][] arr) {
        if(hint_indx == n){
            answer+=1;
            return answer;
        }

        return answer;



    }

    public static void main(String[] args) {
        numberBaseball_Recur T = new numberBaseball_Recur();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(0, 0, arr));
    }

}
