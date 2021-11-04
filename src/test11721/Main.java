package test11721;
/*
상사한 설명 : https://eonhwa-theme.tistory.com/35

- next() : 개행문자, 공백은 무시하고 문자를 입력받는다
- nextLint() : 한 줄 단위로 입력받기 때문에 개행문자도 한 줄로 인식한다.
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for(int i=0; i<input.length(); i++){

            if(i % 10 == 0 && i != 0)
                System.out.println();
            System.out.print(input.charAt(i));

        }
    }
}

