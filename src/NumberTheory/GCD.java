package NumberTheory;

import java.util.Scanner;

//최대공약수 구하기
public class GCD {

    public void solution(int a, int b){
        while(a%b !=0){
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        System.out.println(b);
    }
    public static void main(String[] args) {
        GCD T = new GCD();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        T.solution(a,b);
    }
}
