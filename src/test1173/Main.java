package test1173;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        // 5 70 120 25 15
//        // N  m  M  T  R
//        int N = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        int T = Integer.parseInt(st.nextToken());
//        int R = Integer.parseInt(st.nextToken());
//
//        int time = 0; // 구해야할 최소 시간
//        int cnt = 0; //운동 횟수
//        int pulse = m; // 초기맥박 m 으로 초기화
//
//        if(M - m < T)
//            System.out.println("-1");
//
//        while(cnt < N){
//            // M 이하일때만 운동 가능
//            if(pulse + T <= M){
//                time++;
//                cnt++;
//                pulse += T;
//            }else{ // 휴식해야 한다면
//                if(pulse - R < m) { // 최소맥박 보다 작으면 맥박은 m이 된다
//                    time++;
//                    pulse = m;
//                }else{
//                    time++;
//                    pulse -= R;
//                }
//            }
//        }
//        System.out.println(time);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int count=1;
        int X = m; // 초기 맥박 설정
        int time = 0; // ** 구해야할 최소 시간

        // 운동 한번하는데 최대 맥박M 넘어가면 운동 못함
        // M - m
        if(M-m < T)
            System.out.println("-1");
        while( count <= N){
            if( X+T <= M ){
                time++;
                count++;
                X += T;
            }else{ //휴식해야함
                if(X-R <= m) {
                    time++;
                    X = m;
                }else {
                    time++;
                    X = X - R;
                }

            }

        }
        System.out.println(time);
    }
}
