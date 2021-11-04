package test10808;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] count = new int[26];

        for(int i=0; i<input.length(); i++){
            count[input.charAt(i) - 97]++;
        }
        for(int i=0; i<count.length; i++){
            System.out.print(count[i] + " ");
        }
    }
}
