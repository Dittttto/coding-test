import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            hm.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int result = 0;
            for (String person: photo[i]) {
                result += hm.getOrDefault(person, 0);
            }
            answer[i] =result;
        }
        return answer;
    }
}