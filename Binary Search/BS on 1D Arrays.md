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

##  Binary Search Lower Bound / Upped Bound

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
            if (nums[mid] >= target) { // (nums[mid] > taarget)
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
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

##  Find First and Last Position of Element in Sorted Array (BS)
LeetCode Question [Link](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/)

### 📄 File: 

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lb = lowerbound(nums, n, target);
        if (lb == n || nums[lb] != target) 
            return new int[] {-1, -1};
        return new int [] {lb, upperbound(nums, n, target) -1};
    }

    int lowerbound (int arr[], int n, int k) {
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    int upperbound (int arr[], int n, int k) {
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
```

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = binarySearch(nums, target, true);
        ans[1] = binarySearch(nums, target, false);

        return ans;
    }

    int binarySearch (int nums[], int target, boolean findFirst) {
        int low = 0, high = nums.length - 1, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                ans = mid;
                if (findFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return ans;
    }
}
```

##  Search Insert Position (BS)
LeetCode Question [Link]( )

### 📄 File: 

```java

```

##  Search Insert Position (BS)
LeetCode Question [Link]( )

### 📄 File: 

```java

```

##  Search Insert Position (BS)
LeetCode Question [Link]( )

### 📄 File: 

```java

```

##  Search Insert Position (BS)
LeetCode Question [Link]( )

### 📄 File: 

```java

```
