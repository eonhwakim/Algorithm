package test1152;

import java.util.Scanner;

public class solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim(); // 문자열 앞뒤 공백 제거

        /* split 함수 주의점
        * 공백만 입력받았을 경우 단어의 개수는 0개 이어야 하는데 1이 출력됨
        * 빈문자열을 갖는 문자열로 판단함 ("") - null과 다름 => 배열의 크기는 1이 됨
        */

        //<예외 설정> isEmpty()함수로 문자열이 비어있다면 0 출력
        if(str.isEmpty())
            System.out.println('0');
        else
            System.out.println(str.split(" ").length); //split()함수로 문자열 나눔(공백" "기준_

    }
}

