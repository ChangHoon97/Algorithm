package Deepen.TwoDimensionDP;

import java.util.Scanner;

//2차원 DP
//많이 이동하기
//1937
public class twoDimension_DP_1 {
    static int[][] dp;
    static int[][] graph;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 그래프의 크기

        graph = new int[n][n];
        dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        // 모든 점을 방문한다!
        // 방문한 뒤에 이동할 수 있는 모든 경우의 수를 재귀로 구현한다!
        // 재귀로 구현한 뒤 DP로 바꾼다!
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                recur(y, x);
            }
        }

        // 최대 값 찾기
        int max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }

        System.out.println(max + 1);
    }

    static int recur(int y, int x) {
        if (dp[y][x] != 0) {
            return dp[y][x];
        }

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int[] dir : directions) {
            int ey = y + dir[0];
            int ex = x + dir[1];

            if (0 <= ey && ey < n && 0 <= ex && ex < n) {
                if (graph[y][x] < graph[ey][ex]) {
                    dp[y][x] = Math.max(dp[y][x], recur(ey, ex) + 1);
                }
            }
        }

        return dp[y][x];
    }
}
