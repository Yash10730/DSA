class Solution {
    public int countMinReversals(String s) {
        
        int n = s.length();

        if (n % 2 != 0) {
            return -1;
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '{') {
                stack.push(ch);
            } else { 
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop(); 
                } else {
                    stack.push(ch);
                }
            }
        }

       
        int open = 0, close = 0;
        while (!stack.isEmpty()) {
            if (stack.pop() == '{') {
                open++;
            } else {
                close++;
            }
        }

        // Number of reversals = ceil(open/2) + ceil(close/2)
        return (open + 1) / 2 + (close + 1) / 2;
    }
}