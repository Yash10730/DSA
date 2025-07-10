class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakIndex(mountainArr);

        // Search in the increasing part
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;

        // Search in the decreasing part
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    // Step 1: Find peak index
    private int findPeakIndex(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    // Step 2: Binary Search (orderAgnostic=true for increasing part, false for decreasing)
    private int binarySearch(MountainArray arr, int target, int start, int end, boolean orderAgnostic) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int value = arr.get(mid);

            if (value == target) return mid;

            if (orderAgnostic) {
                if (value < target) start = mid + 1;
                else end = mid - 1;
            } else {
                if (value > target) start = mid + 1;
                else end = mid - 1;
            }
        }

        return -1;
    }
}
