# Java Programs:

---

## 3 Sum
LeetCode Question [Link](https://leetcode.com/problems/3sum/)
### 📄 Code:

```java
Brute Force Solution:

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set <List<Integer>> st =new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(st);
    }
}
```

```java
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List <List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j + 1]) j--;
                    while (j < k && nums[k] == nums[k - 1]) j++;
                }
            }
        }
        return res;
    }
}
```


## 4 sum
LeetCode Question [Link]()
### 📄 Code:

```java

```

## 4 sum
LeetCode Question [Link]()
### 📄 Code:

```java

```

## 4 sum
LeetCode Question [Link]()
### 📄 Code:

```java

```

## 4 sum
LeetCode Question [Link]()
### 📄 Code:

```java

```