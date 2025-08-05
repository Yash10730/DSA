class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
          int n = fruits.length;
        boolean[] used = new boolean[n];  
        int unplaced = 0;

        for (int i = 0; i < n; i++) {
            boolean placed = false;
            for (int j = 0; j < n; j++) {
                if (!used[j] && baskets[j] >= fruits[i]) {
                    used[j] = true;  // Mark basket as used
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                unplaced++;  // Could not place this fruit
            }
        }

        return unplaced;
    }
}