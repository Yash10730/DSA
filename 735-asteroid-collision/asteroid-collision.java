import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!st.isEmpty() && asteroid < 0 && st.peek() > 0) {
                if (st.peek() < -asteroid) {
                    st.pop(); // top asteroid explodes
                } else if (st.peek() == -asteroid) {
                    st.pop(); // both explode
                    destroyed = true;
                    break;
                } else {
                    // current asteroid explodes
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                st.push(asteroid);
            }
        }

        // Convert stack to array
        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}
