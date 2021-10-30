/*
백준 사이트 링크 : https://www.acmicpc.net/problem/1260
더 자세한 풀이 : https://eonhwa-theme.tistory.com/30

DFS 와 BFS를 제대로 이해하려면 기본 자료구조인 스택과 큐에 대한 이해가 전제되어야 함
스택 : 선입후출 (컵)
큐 : 선입선출 (터널)
재귀함수도 이해해야함
-----------------------------------
dfs
재귀함수로 구현
1) 탐색하려는 노드가 탐색을 이미 한 노드인지 확인하고

2) 탐색하려는 노드의 자식노드들을 확인한다.

3) 자식노드가 없으면 탐색은 종료되고

4) 자식노드가 있으면 자식노드를 같은 방식으로 탐색한다.
------------------------------------
------------------------------------
입력
정점개수N , 간선개수M , 탐색시작 정점번호V
(M개의 줄 동안) 연결된 두 정점 번호

출력
DFS 수행 결과  <- 스택 사용하지 않고 재귀 통해 구현
BFS 수행 결과  <- 큐를 통해 구현

 */

package test1260;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int[][] check;       // 간선 연결 상태
    static int n,m;             // 정점개수, 간선개수
    static int start;           // 시작정점
    static boolean[] visited;   // 방문 여부

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //정점
        m = sc.nextInt(); //간선
        start = sc.nextInt(); //탐색 시작한 정점

        check = new int[n+1][n+1]; // 좌표를 그대로 받아들이기 위해 +1
        visited = new boolean[n+1]; // 초기값 False

        // 간선 연결 상태 저장
        for(int i=1; i<=m; i++) {
            int x = sc.nextInt(); //1
            int y = sc.nextInt(); //2

            check[x][y] = check[y][x] = 1;
        }
        dfs(start);

        visited = new boolean[n+1]; // 확인상태 초기화
        System.out.println();

        bfs();

    }


    public static void dfs(int i){
        //(재귀)시작점을 변수로 받아 확인, 출력 후 다음 연결점을 찾아 시작점을 변경하여 재호출
        visited[i] = true;
        System.out.print(i + " ");

        for(int j=1; j<=n; j++){
            if(check[i][j] == 1 && visited[j] == false){
                dfs(j);
            }
        }
    }


    public static void bfs(){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(start); // 시작점도 큐에 넣어야 함
        visited[start] = true;
        System.out.print(start + " ");

        // Queue가 빌 때까지 반복. 방문 정점은 확인, 출력 후 Queue에 넣어 순서대로 확인
        while(!q.isEmpty()){
            int tmp = q.poll();

            for(int j=1; j<=n; j++){
                if(check[tmp][j] == 1 && visited[j] == false){
                    q.offer(j);
                    visited[j] = true;
                    System.out.print(j + " ");
                }
            }
        }
    }
}
