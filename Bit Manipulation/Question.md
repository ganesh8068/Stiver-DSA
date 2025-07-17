# Java Programs: Bit Manipulation Question
---


##  Power of Two
Leetcode Question [Link](https://leetcode.com/problems/power-of-two/description/)
### 📄 File:
```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}
```

##  Minimum Bit Flips to Convert Number
Leetcode Question [Link](https://leetcode.com/problems/minimum-bit-flips-to-convert-number/)
### 📄 File:
```java
class Solution {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }
}
```


##  Single Number
LeetCode Question [Link](https://leetcode.com/problems/single-number/)
### 📄 File:
```java
class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count ^= nums[i];
        }

        return count;
    }
}
```


##  Subset (Power Set)
LeetCode Question [Link](https://leetcode.com/problems/subsets/description/)
### 📄 File:
```java
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List <List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < (1 << n); i++) {
            List <Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) subset.add(nums[j]);
            }
            result.add(subset);
        }
        return result;
    }
}
```

##  Power n
LeetCode Question [Link](https://leetcode.com/problems/powx-n/)
### 📄 File:
```java
class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        long power = Math.abs((long)n); 

        for (int i = 0; i < power; i++) {
            result *= x;
        }

        return n < 0 ? 1.0 / result : result;
    }
}

class Solution {
    public double myPow(double x, int n) {
        return binaryExp(x, (long) n);
    }

    private double binaryExp(double x, long n) {
        if (n == 0) {
            return 1;
        }
       
        if (n < 0) {
            return 1.0 / binaryExp(x, -n);
        }
       
        if (n % 2 == 1) {
            return x * binaryExp(x * x, (n - 1) / 2);
        } else {
            return binaryExp(x * x, n / 2);
        }
    }
}

```