package test10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] input = new char[5][15]; //(세로 5 가로 15)

        for(int i=0; i<input.length; i++){
            // 문자열 (5번) 입력 받기
            String str = br.readLine();
            // 문자 하나씩 검사하기위해 문자열을 문자배열에 하나씩 넣어주기
            for(int j=0; j<str.length(); j++){
                input[i][j] = str.charAt(j);
            }
        }

        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(input[j][i] == '\0' )
                    continue;
                System.out.print(input[j][i]);
            }
        }

    }
}
