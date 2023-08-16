package BruteForce;

import java.util.Scanner;

//사탕
//14568
public class candy {
    public int solution(int n){
        int answer =0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-1; j++){
                for(int k=1; k<=n-2; k++){
                    if(i-j>=2){
                        if(k%2 ==0){
                           if((i+j+k) == n){
                               answer++;
                           }
                        }
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        candy T = new candy();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
