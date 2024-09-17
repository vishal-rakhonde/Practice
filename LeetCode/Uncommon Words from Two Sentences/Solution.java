class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        
        countWords(s1, map);
        countWords(s2, map);
        
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        
        return result.toArray(new String[0]);
    }
    
    private void countWords(String sentence, Map<String, Integer> map) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
    }
}