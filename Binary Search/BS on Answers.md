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

##  Koko Eating Bananas
Leetcode Question [Link]()
### 📄 File:
```java

```

##  Minimum days to make M bouquets 
Leetcode Question [Link]()
### 📄 File:
```java

```

##  Find the smallest Divisor
Leetcode Question [Link]()
### 📄 File:
```java

```

##  Capacity to Ship Packages within D Days
Leetcode Question [Link]()
### 📄 File:
```java

```

##  Kth Missing Positive Number 
Leetcode Question [Link]()
### 📄 File:
```java

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
Leetcode Question [Link]()
### 📄 File:
```java

```

##  Painter's partition
Leetcode Question [Link]()
### 📄 File:
```java

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