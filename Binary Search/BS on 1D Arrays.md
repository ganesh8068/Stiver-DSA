# Java Programs: BS on 1D Arrays

---

##  Binary Search to find X in sorted array
Leetcode Question [Link](https://leetcode.com/problems/binary-search/)
### 📄 File:
```java
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
```

##  Binary Search Lower Bound

### 📄 File:
```java
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target >= nums[mid]) { // (target > nums[mid])
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}
```

##  Search Insert Position (BS)
LeetCode Question [Link](https://leetcode.com/problems/search-insert-position/description/)

### 📄 File: 

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target > nums[mid]) {
                low = mid + 1; 
            } else {
                ans = mid;
                high = mid -1;
            }
        }
        return ans;
    }
}
```