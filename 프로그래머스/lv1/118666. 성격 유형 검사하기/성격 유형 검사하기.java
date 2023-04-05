import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        ArrayList<String> nameArr = new ArrayList<>(Arrays.asList("R","T","C","F","J","M","A","N"));
        int[][] index = new int[][]{{0,0}, {0,0}, {0,0}, {0,0}};
        int[] score = new int[]{3,2,1,0,1,2,3};
        String answer ="";
        
        for(int i = 0; i < survey.length; i++){
            String[] names = survey[i].split("");
            int n  = names.length;
            String A = names[0];
            String B = names[1];
            int choice = choices[i];
            int idx = 0;
            if(choice == 4)continue;
            if(choice < 4) {
                idx = nameArr.indexOf(A);
            }else {
                idx = nameArr.indexOf(B);
            }
            
            index[idx/n][idx%n] += score[choice-1];
        }
        
        for(int i = 0; i< index.length; i++) {
            if(index[i][0] >= index[i][1]){  
                answer += nameArr.get(i * 2);
            } else{ 
                answer += nameArr.get(i * 2+1);
            }
        }
        return answer;
    }
}