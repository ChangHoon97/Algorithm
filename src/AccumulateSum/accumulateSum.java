package AccumulateSum;

import java.util.Scanner;

//수열
//2259
public class accumulateSum {

    public void solution(int n, int interval, int[] list){
        int answer = Integer.MIN_VALUE;
        int[] prefix = new int[n];
        prefix[0] = list[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + list[i];
        }
        for(int i=0+interval; i<=n-interval; i++){
            if (prefix[i]-prefix[i-interval] > answer) answer = prefix[i]-prefix[i-interval];
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        accumulateSum T = new accumulateSum();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int interval = sc.nextInt();
        int[] list = new int[n];
        for(int i=0; i<n; i++){
            list[i] = sc.nextInt();
        }
        T.solution(n,interval,list);
    }
}
