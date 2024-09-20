class Solution {
    Map<String, List<Integer>> map = new HashMap<>();

    public List<Integer> diffWaysToCompute(String expression) {
        if (map.containsKey(expression)) {
            return map.get(expression);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));

                for (int l : left) {
                    for (int r : right) {
                        switch (ch) {
                            case '+':
                                result.add(l + r);
                                break;
                            case '-':
                                result.add(l - r);
                                break;
                            case '*':
                                result.add(l * r);
                                break;
                        }
                    }
                }
            }
        }

        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }

        map.put(expression, result);
        return result;
    }
}
