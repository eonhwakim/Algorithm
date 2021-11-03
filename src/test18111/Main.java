package test18111;
/*

목적 : 집터 내의 땅의 높이를 일정하게 바꾸는 것!
1. 좌표(i,j)의 가장 위에 있는 블록을 제거하여 인벤토리에 넣는다 (2초)
2. 인벤토리에서 블록 하나를 꺼내어 좌표 (i,j)의 가장 위에 있는 블록 위에 놓는다. (1초)


- 쌓아야 되는 블록의 수가 제거한 수와 기존 블록의 수의 합보다 작으면 해당 높이로 만들수 없으므로 넘어간다
해당 높이로 만들 수 있다면, 작업에 소요되는 최소시간을 구한다
시간에 따라 최대 높이를 구해야하므로 같은 시간이 걸리더라도 높이가 높다면 높이 역시 바꿔준다.

 현재 인벤토리에 있는 블럭의 수 + 땅에 있는 블럭의 수 = 내가 사용가능한 블럭의 수
 땅의 높이가 될 수 있는 최댓값을 찾고, 높이를 줄여나가면서 소요시간의 최솟값 계산
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        int total = b;
        // 맵에 값 넣기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                total += map[i][j];
            }
        }
        // 한 칸에 가질 수 있는 최대 높이 (평탄화 했을 때)
        int height = (total) / (n * m);
        if (height > 256)
            height = 256;
        int min_time = Integer.MIN_VALUE;
        // System.out.println(time); 2147483647

        int final_height = height;
        while (height >= 0) {
            int currentTime = 0;
            // 현재 높이에서의 시간 구하기
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] <= height) //더함 1초
                        currentTime += (height - map[i][j]);
                    else
                        currentTime += (2 * (map[i][j] - height));

                }
            }
            //최솟값 찾기 스왑
            if (currentTime < min_time) {
                min_time = currentTime;
                final_height = height;
            }
            height--;
        }
        System.out.println(min_time + " " + final_height);
    }
}
