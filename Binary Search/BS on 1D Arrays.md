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

##  Search in Rotated Sorted Array I 
LeetCode Question [Link](https://leetcode.com/problems/search-in-rotated-sorted-array/)

### 📄 File: 

```java
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
```

##  Search in Rotated Sorted Array II
LeetCode Question [Link](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)

### 📄 File: 

```java
class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return true;
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }
}
```

##  Find Minimum and Maximum in Rotated Sorted Array
LeetCode Question [Link](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)

### 📄 File: 

```java
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Smallest Element
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }

            // Maximum Element
            // if (nums[mid] > nums[high]) {
            //     low = mid;
            // } else {
            //     high = mid - 1;
            // }
        }

        return nums[low];
    }
}

```

##  Find out how many times has an array been rotated

### 📄 File: 

```java
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
```

##  Single element in a Sorted Array (BS)
LeetCode Question [Link](https://leetcode.com/problems/single-element-in-a-sorted-array/submissions/1659721705/)

### 📄 File: 

```java
class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int low = 1;
        int high = n - 2;

        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n - 1] != arr[n - 2]) return arr[n-1];

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || 
            (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return arr[low];

        // if (n == 1) return arr[0];
        // if (arr[0] != arr[1]) return arr[0];
        // if (arr[n - 1] != arr[n - 2]) return arr[n - 1];
        // for (int i = 1; i < n; i++) {
        //     if (arr[i] != arr[i-1] && arr[i] != arr[i+1]) {
        //         return arr[i];
        //     } 
        // }
        // return -1;

    }
}
```

##  Find peak element 
LeetCode Question [Link](https://leetcode.com/problems/find-peak-element/submissions/1660095387/)

### 📄 File: 

```java
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left; 
    }
}

```
