package optimization;

import java.util.Scanner;

//약수 빠르게 구하기
//1978, 11653, 14232

//나중에 HashSet 사용해서 출력해보기
public class fast_Aliquot {

    public void solution(int n) {
        int range = (int)Math.sqrt(n);
        for (int i = 1; i <=range; i++){
            if(n%i ==0){
                System.out.print(i + " " + n/i + " ");
            }
        }
    }

    public static void main(String[] args) {
        fast_Aliquot T = new fast_Aliquot();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.solution(n);
    }
}
