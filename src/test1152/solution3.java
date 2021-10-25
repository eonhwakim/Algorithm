package test1152;

import java.io.IOException;

// 문자 하나씩 검사 하는 방법
// 이전의 문자 저장할 pre_str, 현재 입력받은 문자 저장할 str
// ASCII 32 = space
public class solution3 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int pre_str = 32; // 공백 의미
        int str;

        while(true){
            str = System.in.read(); //read()메소드는 단순 인풋스트림에서 한 바이트만 읽는 메소드

            // 입력받은 문자가 공백일때
            if(str == 32){
                // 이전의 문자가 공백이 아니라면
                if(pre_str != 32) count++;
            }

            // 입력받은 문자가 개행일때 ('\n')
            else if(str == 10){
                // 이전의 문자가 공백이 아니라면
                if(pre_str != 32) count++;
                break;
            }

            pre_str = str;
        }
        System.out.println(count);
    }
}
