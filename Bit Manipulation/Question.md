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


##  
LeetCode Question [Link]()
### 📄 File:
```java

```