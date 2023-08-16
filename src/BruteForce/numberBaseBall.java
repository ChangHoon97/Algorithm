package BruteForce;

import java.util.Scanner;

//숫자야구
//2503
public class numberBaseBall {

    public int solution(int n, int[][] arr){
        int answer =0;
        for(int a=1; a<10; a++){    //100의 자리 수
            for(int b=1; b<10; b++){    //10의 자리 수
                for(int c=1; c<10; c++){    //1의 자리 수
                    if(a==b || b==c || a==c) continue;
                    int cnt =0;
                    for(int i=0; i<n; i++){
                        int strike = 0; //strike 체크
                        int ball =0;    //ball 체크
                        //arr의 수 100의 자리, 10의 자리, 1의 자리 나누기 (x,y,z)
                        int x =(int)arr[i][0]/100;
                        int y=((int)arr[i][0]/10) -(10*x);
                        int z=(int)arr[i][0]%10;
                        //ball 일때와 strike일때 기록
                        if(a==x) strike ++;
                        if(b==y) strike ++;
                        if(c==z) strike ++;
                        if(x==b || x==c) ball++;
                        if(y==a || y==c) ball++;
                        if(z==a || z==b) ball++;
                        if(strike == arr[i][1] && ball == arr[i][2]){   //일치하면 cnt++
                            cnt++;
                        }
                    }
                    if(cnt == n) answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        numberBaseBall T = new numberBaseBall();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n,arr));
    }
}
