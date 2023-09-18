package optimization;

//조명
//15736

import java.util.Scanner;

//제곱수를 구하는 문제
public class squareRoot {

    public int solution(int n){
        int x = (int)Math.sqrt(n);
        return x;
    }

    public static void main(String[] args) {
        squareRoot T = new squareRoot();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
