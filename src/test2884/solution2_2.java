package test2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
BufferedReader 로 입력받기
readLine() 을 통해 입력 받기
       : 한 행을 전부 읽기 때문에 공백단위로 분리
=> split(" ") 공백 단위로 문자열 나눔
       : String 배열에 각각 저장
 */
public class solution2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int h = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        if(m < 45){
            h --;
            m = 60 - (45 - m);
            if(h < 0){
                h = 23;
            }
            System.out.println(h + " " + m);
        }else{
            m -= 45;
            System.out.println(h+ " " + m );
        }
    }
}
