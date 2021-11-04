package test10808;
/*
StringBuilder 는 String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라
기존의 데이터에 더하는 방식을 사용하기 때문에 속도도 빠르며 상대적으로 부하가 적다.
따라서 긴 문자열을 더하는 상황이 발생할 경우 적극적으로 사용
- StringBuilder 에는 append() 가 있는데 이는 문자열을 더하는 역할을 한다.
- 만들어진 문자열을 출력하기 위해서는 StringBuilder의 인스턴스인 sb의 toString() 을 사용

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] count = new int[26];

        String input = br.readLine();

        for(int i=0; i<input.length(); i++){
            count[(int)input.charAt(i) - 97] ++;
        }
        for(int i=0; i<count.length; i++){
            sb.append(count[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
