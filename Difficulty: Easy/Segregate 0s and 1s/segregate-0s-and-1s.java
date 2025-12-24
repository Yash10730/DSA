class Solution {

    void segregate0and1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // move left while 0
            while (left < right && arr[left] == 0) {
                left++;
            }

            // move right while 1
            while (left < right && arr[right] == 1) {
                right--;
            }

            // swap when left=1 and right=0
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
}
