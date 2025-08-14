import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

 
        int maxFromRight = arr[n - 1];
        result.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                result.add(maxFromRight);
            }
        }

      
        ArrayList<Integer> leadersList = new ArrayList<>();
        for (int i = result.size() - 1; i >= 0; i--) {
            leadersList.add(result.get(i));
        }

        return leadersList;
    }

   
}
