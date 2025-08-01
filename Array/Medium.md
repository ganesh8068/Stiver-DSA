# Java Programs:

---

## 2 Sum

### 📄 Code:

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int moreNeeded = target - num;

            if (mpp.containsKey(moreNeeded)) {
                return new int[] {mpp.get(moreNeeded), i};
            }

            mpp.put(num, i);  
        }

        return new int[] {-1, -1}; 
    }
}
```

## Sort an array of 0's 1's and 2's

### 📄 Code:

```java
import java.util.*;

public class Main {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1; 
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;

            } else if (arr.get(mid) == 1) {
                mid++;

            } else {
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
            }
        }
    }

    public static void main(String args[]) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }

}

```

## Majority Element (>n/2 times)

### 📄 Code:

```java

import java.util.*;

public class Main {
    public static int majorityElement(int []v) {
        int n = v.length;
        int cnt = 0; 
        int el = 0; 
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }

}

```

## Using Kadane's Algorithm, maximum subarray sum
LeetCode Question [Link](https://leetcode.com/problems/maximum-subarray/description/)
### 📄 Code:

```java
class Solution {
  public int maxSubArray(int[] nums) {
    int sum = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      
      if (sum > max) {
        max = sum;
      }
        
      if (sum < 0) {
        sum = 0;
      }
    }  
    return max;
  }
}

```

## Stock Buy and Sell
LeetCode Question [Link](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
### 📄 Code:

```java
class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i]; 
            }

            profit = Math.max(profit, prices[i] - buy);
        }

        return profit;
    }
}

```

## Rearrange the array in alternating positive and negative items
LeetCode Question [Link](https://leetcode.com/problems/rearrange-array-elements-by-sign/)
### 📄 Code:

```java
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List <Integer> pos = new ArrayList<>();
        List <Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }

        for (int i = 0; i < n/2; i++) {
            nums[2*i] = pos.get(i);
            nums[2*i+1] = neg.get(i);
        }
        return nums;
    }
}
```


## Next Permutation

### 📄 Code:

```cpp
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        next_permutation(nums.begin(), nums.end());
    }
};
```

## Leaders in an Array problem

### 📄 Code:

```java
import java.util.*;

class Main {
    static List<Integer> superelement(int[] a) {
        List<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE ;
        int n = a.length;

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > maxi) {
                ans.add(a[i]);
            }
            maxi = Math.max(maxi, a[i]);
        }

        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> result = superelement(arr);
        System.out.println("Super elements: " + result);
    }
}

```

## Longest Consecutive Sequence in an Array
LeetCode Question [Link](https://leetcode.com/problems/longest-consecutive-sequence/)
### 📄 Code:

```java
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);  
        }

        int longest = 0;

        for (int num : set) {  
            if (!set.contains(num - 1)) {  
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}


```

## Set Matrix Zeros
LeetCode Question [Link](https://leetcode.com/problems/set-matrix-zeroes/description/)
### 📄 Code:

```java
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i] [j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix [i] [j] = 0;
                }
            }
        }
    }
}
```

## Rotate Matrix by 90 degrees

### 📄 Code:
LeetCode Question [Link](https://leetcode.com/problems/rotate-image/)
```java
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix [i] [j];
                matrix [i] [j] = matrix [j] [i];
                matrix [j] [i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix [i][j];
                matrix [i] [j] = matrix [i] [n - 1 - j];
                matrix [i] [n - 1 - j] = temp;
            }
        }

        
    }
}
```

## Print the matrix in spiral manner
LeetCode Question [Link](https://leetcode.com/problems/spiral-matrix/)
### 📄 Code:

```java
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int x = 0, y = 0, dx = 1, dy = 0;
        List <Integer> res = new ArrayList<>();

        for (int i = 0; i < row * col; i++) {
            res.add(matrix[y][x]);
            matrix[y][x] = -101;

            if (!(0 <= x + dx && x + dx < col && 0 <= y + dy && y + dy < row ) || matrix[y + dy] [x + dx] == -101) {

                int temp = dx;
                dx = -dy;
                dy = temp;
            }
            x = x + dx;
            y = y + dy;
        }
        return res;
    }
}
```

## Remove Sub-Folders from the Filesystem
LeetCode Question [Link](https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/description)
### 📄 Code:

```java
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);

        for (int i = 1; i < folder.length; i++) {
            if (!folder[i].startsWith(ans.get(ans.size() - 1) + "/")) {
                ans.add(folder[i]);
            }
        }
        return ans;
    }
}
```