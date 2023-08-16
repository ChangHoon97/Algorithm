package BruteForce;

import java.util.Scanner;

//19532
//연립방정식
public class simultaneousEquations {

    public void solution(int a, int b, int c, int d, int e, int f){
        for(int x = -999; x<1000; x++){
            for(int y = -999; y<1000; y++){
                if((a*x)+(b*y) == c){
                    if((d*x)+(e*y) == f){
                        System.out.print(x+" " + y);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        simultaneousEquations T = new simultaneousEquations();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        T.solution(a,b,c,d,e,f);
    }
}
