import java.util.HashMap;
import java.util.Map;

class Node {
    Map<Character, Pair> umc = new HashMap<>();
}

class Pair {
    int count;
    Node node;

    Pair(int count, Node node) {
        this.count = count;
        this.node = node;
    }
}

class Trie {
    private Node root = new Node();

    public void insert(String s) {
        Node cur = root;
        for (char c : s.toCharArray()) {
            cur.umc.putIfAbsent(c, new Pair(0, new Node()));
            cur.umc.get(c).count++;
            cur = cur.umc.get(c).node;
        }
    }

    public int checkPrefixCount(String s) {
        Node cur = root;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (!cur.umc.containsKey(c)) break;
            count += cur.umc.get(c).count;
            cur = cur.umc.get(c).node;
        }
        return count;
    }
}

class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie trie = new Trie();
        for (String word : words) trie.insert(word);

        int[] ans = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            ans[i] = trie.checkPrefixCount(words[i]);
        }
        return ans;
    }
}
