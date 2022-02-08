package test2884;

import java.util.Scanner;

/*
45분전의 시간을 구하면 된다
*/
public class solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if( m < 45 ) {
            h--;
            m = 60 - (45 - m);
            // h시간이 0시라면 음수값이 됨 -> 23시로
            if(h < 0 ){
                h = 23;
            }
            System.out.println(h + " " + m);
        }else {
            m -= 45;
            System.out.println(h + " " + m);
        }

    }
}
