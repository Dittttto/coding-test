import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<String, Integer> hm = new HashMap<>(){{
            put("R", 0);put("T", 1);put("C", 2);put("F", 3);
            put("J", 4);put("M", 5);put("A", 6);put("N", 7);
        }};
        String[] name = new String[]{"R","T","C","F","J","M","A","N"};
        int[][] index = new int[][]{{0,0}, {0,0}, {0,0}, {0,0}};
        int[] score = new int[]{3,2,1,0,1,2,3};
        
        for(int i = 0; i < survey.length; i++){
            String[] names = survey[i].split("");
            int n  = names.length;
            String A = names[0];
            String B = names[1];
            int choice = choices[i];
            int idx = 0;
            if(choice == 4)continue;
            if(choice < 4) {
                idx = hm.get(A);
            }else {
                idx = hm.get(B);
            }
            
            index[idx/n][idx%n] += score[choice-1];
            
        }
        String answer ="";
        
        for(int i = 0; i< index.length; i++) {
            if(index[i][0] >= index[i][1]){  
                answer += name[i * 2];
            } else{ 
                answer += name[i * 2+1];
            }
            
            
        }
        return answer;
    }
}