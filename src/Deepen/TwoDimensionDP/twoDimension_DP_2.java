package Deepen.TwoDimensionDP;

import java.util.Scanner;

//2차원 DP
//끝까지 이동하기
//1520
public class twoDimension_DP_2 {
    static int[][] dp; // DP 테이블. 각 지점에서의 가능한 경로의 수를 저장합니다.
    static int[][] graph; // 주어진 그래프 정보를 저장합니다.
    static int Y, X; // 그래프의 크기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Y = sc.nextInt(); // 그래프의 세로 크기
        X = sc.nextInt(); // 그래프의 가로 크기

        graph = new int[Y][X];
        dp = new int[Y][X];

        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                graph[i][j] = sc.nextInt(); // 그래프 정보를 입력받습니다.
                dp[i][j] = -1; // dp 배열을 초기화합니다.
            }
        }

        int answer = recur(0, 0); // (0, 0) 지점에서 시작하여 가능한 경로의 수를 계산합니다.

        System.out.println(answer); // 결과를 출력합니다.
    }

    static int recur(int y, int x) {
        if (y == Y - 1 && x == X - 1) {
            return 1; // 목적지에 도달했을 때 1을 반환합니다.
        }

        if (dp[y][x] != -1) {
            return dp[y][x]; // 이미 계산한 값이라면 반환합니다.
        }

        int route = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; // 아래, 위, 오른쪽, 왼쪽으로 이동하는 방향을 정의합니다.

        for (int[] dir : directions) {
            int ey = y + dir[0]; // 다음 이동할 지점의 y 좌표 계산
            int ex = x + dir[1]; // 다음 이동할 지점의 x 좌표 계산

            if (0 <= ey && ey < Y && 0 <= ex && ex < X) { // 유효한 좌표인지 확인합니다.
                if (graph[y][x] > graph[ey][ex]) { // 다음 지점이 현재 지점보다 낮은지 확인합니다.
                    route += recur(ey, ex); // 가능한 경로의 수를 누적합니다.
                }
            }
        }

        dp[y][x] = route; // dp 테이블에 결과를 저장합니다.

        return dp[y][x]; // 계산된 값을 반환합니다.
    }
}
