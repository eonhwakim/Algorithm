package test11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String num = sc.next();
        int sum = 0;

        for(int i=0; i<cnt; i++){
            sum += num.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
