package test2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
BufferedReader 로 입력받기
readLine() 을 통해 입력 받기
       : 한 행을 전부 읽기 때문에 공백단위로 분리
=> StringTokenizer 클래스를 이용하여 분리
 */
public class solution2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " "); // st.nextTokon() 은 문자열을 반환하니 Interger.parseInt()로 int형으로 변환시켜줌

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

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
