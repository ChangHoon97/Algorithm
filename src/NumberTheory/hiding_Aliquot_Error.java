package NumberTheory;

import java.util.Scanner;

//숨어있는 약수 찾기
//1407, 2247
//코드 틀렸다
public class hiding_Aliquot_Error {

    public void solution(int a, int b){
        int tmp_A = a;
        tmp_A -= 1;
        int tmp_B = b;

        for(int i=1; i<99; i++){
            tmp_A += (a/(Math.pow(2,i)))*((Math.pow(2,i))-(Math.pow(2,(i-1))));
        }

        for(int i=1; i<=99; i++){
            tmp_B += (b/(Math.pow(2,i)))*((Math.pow(2,i))-(Math.pow(2,(i-1))));
        }

        System.out.println(tmp_B - tmp_A);
    }

    public static void main(String[] args) {
        hiding_Aliquot_Error T = new hiding_Aliquot_Error();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        T.solution(a,b);
    }
}
