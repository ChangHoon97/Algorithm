package NumberTheory;

import java.util.Scanner;

//최소공배수 구하기
public class LCM {

    public int solution(int a, int b){
        return a*b/GCD(a,b);
    }

    public int GCD(int a, int b){
        while(a%b !=0){
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return b;
    }
    public static void main(String[] args) {
        LCM T = new LCM();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(T.solution(a,b));
    }
}
