package NumberTheory;

import java.util.Arrays;
import java.util.Scanner;

public class aliquot_Sequence {

    public int GCD(int a, int b){
        while(a%b !=0){
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return b;
    }

    public int solution(int n, int[] list){
        int answer =0;
        Arrays.sort(list);
        for(int i=0; i<n-1; i++){
            if(GCD(list[i],list[i+1]) == 1) continue;
            for(int j=list[i]; j<list[i+1]; j++){
                if(GCD(list[i],j)==1 && GCD(list[i+1],j) == 1){
                    answer += 1;
                    break;
                }
                if(j== list[i+1]-1) answer += 2;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        aliquot_Sequence T = new aliquot_Sequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i=0; i<n; i++){
            list[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, list));
    }
}
