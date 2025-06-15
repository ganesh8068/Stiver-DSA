# Java Programs: BS on Answers

---

##  Find square root of a number in log n

### 📄 File:
```java
class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int low = 1, high = x / 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val = (long) mid * mid;

            if (val == x) {
                return mid;
            } else if (val < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
```

##  Minimum days to make M bouquets 
Leetcode Question [Link](https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/)
### 📄 File:
```java
class Solution {
    public static boolean possible (int[] arr, int day, int m, int k) {
        int n = arr.length;
        int cnt = 0, noB = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noB += (cnt / k);
                cnt = 0;
            }
        }
        noB += (cnt / k);
        return noB >= m;
    }

    public int minDays(int[] arr, int m, int k) {
        int n = arr.length;
        if ((long) m * k > n) return -1;

        int mini = 0, max = 0;
        for (int i = 0; i < n; i++) {
            mini = Math.min(arr[i], mini);
            max = Math.max(arr[i], max);
        }

        int low = mini, high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
```

##  Find the smallest Divisor
Leetcode Question [Link](https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/)
### 📄 File:
```java
Brute-Force approach 

class Solution {
  public int smallestDivisor(int[] nums, int threshold) {
    int n = nums.length;
    int sum = 0, high = 0;
    for (int i = 0; i < n; i++) {
      high = Math.max(nums[i], high);
    }
    for (int i = 1; i <= high; i++) {
      int ans = 0;
      for (int d = 0; d < n; d++) {
        ans += Math.ceil((double)(nums[d]) / (double)(i));
      }
      if (ans <= threshold)
        return i;
    }
    return -1;
  }
}
```
```java 
Optimal Approach

class Solution {
    private int sumByD(int[] arr, int div) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) arr[i] / div);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if (n > threshold) return -1;  

        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int low = 1, high = max;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(nums, mid) <= threshold) {
                high = mid - 1;  // Try smaller divisor
            } else {
                low = mid + 1;   // Need larger divisor
            }
        }

        return low;
    }
}
```


##  Capacity to Ship Packages within D Days
Leetcode Question [Link](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/)
### 📄 File:
```java

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        int n = weights.length;

        for (int i = 0; i < n; i++) {
            sum += weights[i];
            max = Math.max(max, weights[i]);
        }

        int low = max, high = sum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            int currentLoad = 0;
            int requirdDays = 1;

            for (int i = 0; i < n; i++) {
                if (currentLoad + weights[i] > mid) {
                    requirdDays++;
                    currentLoad = 0;
                }
                currentLoad += weights[i];
            }

            if (requirdDays <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
```

##  Kth Missing Positive Number 
Leetcode Question [Link](https://leetcode.com/problems/kth-missing-positive-number/)
### 📄 File:
```java
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return k + left;
    }
}
```

##  Aggressive Cows
Leetcode Question [Link]()
### 📄 File:
```java

```

## Book Allocation Problem
Leetcode Question [Link]()
### 📄 File:
```java

```

##  Split array - Largest Sum
Leetcode Question [Link](https://leetcode.com/problems/split-array-largest-sum/)
### 📄 File:
```java
class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        for (int i = 0; i < n; i++) {
            low = Math.max(nums[i], low);
            high += nums[i];
        }

        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isFeasible(nums, mid, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isFeasible (int nums[], int mid, int k) {
        int count = 1;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > mid) {
                count++;
                currentSum = nums[i];

                if (count > k) return false;
            }
        }
        return true;
    }
}
```

##  Painter's partition
Leetcode Question [Link]()
### 📄 File:
```java
Same as Previous Question: Split array
```


##  Minimize Max Distance to Gas Station
Leetcode Question [Link]()
### 📄 File:
```java

```


##  Median of 2 sorted arrays
Leetcode Question [Link]()
### 📄 File:
```java

```


##  Kth element of 2 sorted arrays
Leetcode Question [Link]()
### 📄 File:
```java

```



##  
Leetcode Question [Link]()
### 📄 File:
```java

```