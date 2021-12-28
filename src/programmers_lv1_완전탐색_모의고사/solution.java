package programmers_lv1_완전탐색_모의고사;

import java.util.ArrayList;

public class solution {
    public static int[] solution(int[] answers){
        int[] answer = {};
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        int ans1 = 0;
        int ans2 = 0;
        int ans3 = 0;

        for(int i=0; i<answers.length; i++){
            if(answers[i] == person1[i%5])
                ans1++;
            if(answers[i] == person2[i%8])
                ans2++;
            if(answers[i] == person3[i%10])
                ans3++;
        }

        //max 값 구하기
        int max = Math.max(Math.max(ans1,ans2), ans3);

        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max == ans1) list.add(1);
        if(max == ans2) list.add(2);
        if(max == ans3) list.add(3);

        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);

        return answer;
    }

}
