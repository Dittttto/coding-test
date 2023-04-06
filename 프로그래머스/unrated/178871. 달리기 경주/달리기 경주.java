import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
       HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            hm.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            String name = callings[i];
            int curLank = hm.get(name);
            String prevPlayer = players[curLank-1];
            int prevPlayerLank = hm.get(prevPlayer);
            hm.replace(name, curLank -1);
            hm.replace(prevPlayer, prevPlayerLank +1);
            swap(players, prevPlayerLank, curLank);
        }
        
        return players;
    }

    private static void swap(String[] players, int i, int j){
        String tmp = players[i];
        players[i] = players[j];
        players[j] = tmp;
    }
}