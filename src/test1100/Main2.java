package test1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int SIZE = 8;
        int count = 0;
        String[][] chess = new String[SIZE][SIZE];

        for(int i=0; i<SIZE; i++){
            String[] str = br.readLine().split("");
            for(int j=0; j<SIZE; j++){
                chess[i][j] = str[j];
            }
        }
        for(int i=0; i<SIZE; i++){
            for(int j=0; j<SIZE; j++){
                if( (i+j) % 2 == 0 && chess[i][j].equals() );
            }
        }
    }
}
