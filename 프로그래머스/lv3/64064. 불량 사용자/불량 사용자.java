import java.util.HashSet;

class Solution {
    private static String[] arr;
    private static HashSet<HashSet<Integer>> set = new HashSet<>();
    public int solution(String[] user_id, String[] banned_id) {
        arr = filtered(user_id, banned_id);
        permutation(banned_id, new int[banned_id.length], new boolean[arr.length+1], 0, arr.length, banned_id.length);
        return set.size();
    }
    
    private static void permutation(String[] banned_id, int[] out, boolean[] visited, int depth, int n, int m) {
        if(depth == m) {
            boolean similar = true;
            for (int i = 0; i < banned_id.length; i++) {
                if(!isSimilar(arr[out[i]], banned_id[i])) {
                    similar = false;
                    break;
                }
            }

            if (similar) {
                HashSet<Integer> tmp = new HashSet<>();
                for (int idx: out) {
                    tmp.add(idx);
                }
                set.add(tmp);
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                out[depth] = i;
                permutation(banned_id, out, visited, depth + 1, n, m);
                visited[i] = false;
            }
        }
    }

    private static String[] filtered(String[] user_id, String[] banned_id) {
        HashSet<String> set = new HashSet<>();

        for(String id: user_id) {
            for (String ban: banned_id) {
                if(isSimilar(id, ban)) set.add(id);
            }
        }

        return set.toArray(new String[0]);
    }
    private static boolean isSimilar(String s, String target) {
        if(s.length() != target.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = target.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(tArr[i] == '*') continue;
            if(tArr[i] != sArr[i]) return false;
        }

        return true;
    }
}