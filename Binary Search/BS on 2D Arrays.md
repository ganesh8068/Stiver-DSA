# Java Programs: BS on 2D Arrays
---

##  Find the row with maximum number of 1's

### 📄 File:
```java

import java.util.*;

public class Solution {
  public static int lowerBound(ArrayList<Integer> arr, int n, int x) {
    int low = 0, high = n - 1;
    int ans = n;

    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr.get(mid) >= x) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1; 
      }
    }
    return ans;
  }

  public static int rowWithMax1s(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
    int cnt_max = 0;
    int index = -1;

    for (int i = 0; i < n; i++) {
      int cnt_ones = m - lowerBound(matrix.get(i), m, 1);
      if (cnt_ones > cnt_max) {
        cnt_max = cnt_ones;
        index = i;
      }
    }
    return index;
  }
}


```

##  Search in a 2 D matrix
Leetcode Question [Link](https://leetcode.com/problems/search-a-2d-matrix/description/)
### 📄 File:
```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int n = matrix.length, m = matrix[0].length;
        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2 ;
            int row = mid / m, col = mid % m;
            if (matrix[row] [col] == target) return true;
            else if (matrix[row] [col] < target) low = mid + 1;
            else high = mid - 1;
        } 
        return false;
    }
}
```


##  Search in a row and column wise sorted matrix : II
Leetcode Question [Link](https://leetcode.com/problems/search-a-2d-matrix-ii/description/)
### 📄 File:
```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0, col = m - 1;
        while (row < n && col >= 0) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] > target) col--;
            else row++;
        }
        return false;
    }
}
```


##  Find Peak Element (2D Matrix)
Leetcode Question [Link](https://leetcode.com/problems/find-a-peak-element-ii/description/)
### 📄 File:
```java

```


##  
Leetcode Question [Link]()
### 📄 File:
```java

```