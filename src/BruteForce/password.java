package BruteForce;

import java.util.Scanner;

//완전 탐색(Brute Force)
//머리는 나쁘지만 힘은 쏀 아이
//1816
public class password {

    public void solution(int n, long[] arr){
        for(int i=0; i<n; i++){
            for(int j=2; j<1000001; j++){
                if(arr[i]%j == 0){
                    System.out.println("NO");
                    break;
                }
                if(j == 1000000){
                    System.out.println("YES");
                }
            }
        }
    }
    public static void main(String[] args) {
        password T = new password();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        T.solution(n,arr);

    }

}