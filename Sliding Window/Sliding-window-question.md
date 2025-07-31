# Java Programs: Sliding Window Question

---

## Count Number of Nice Subarrays

LeetCode Question [Link](https://leetcode.com/problems/count-number-of-nice-subarrays/description/)

### 📄 Code:

```java
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] cnt = new int[n + 1];
        cnt[0] = 1;
        int ans = 0, t = 0;
        for (int i = 0; i < n; i++) {
            t += nums[i] & 1;
            if (t - k >= 0) {
                ans += cnt[t - k];
            }
            cnt[t]++;
        }
        return ans;
    }
}
```

## longest repeating character replacement

LeetCode Question [Link](https://leetcode.com/problems/longest-repeating-character-replacement/)

### 📄 Code:

```java
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freqs = new HashMap<>();
        int res = 0, i = 0, maxFreq = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, freqs.get(c));

            while ((j - i + 1) - maxFreq > k) {
                char left = s.charAt(i);
                freqs.put(left, freqs.get(left) - 1);
                i++;
            }

            res = Math.max(res, j - i + 1);
        }

        return res;
    }
}
```

## Longest Substring Without Repeating Characters

LeetCode Question [Link](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

### 📄 Code:

```java
class Solution {
      public int lengthOfLongestSubstring(String s) {
      Map<Character, Integer> map = new HashMap<>();
        int j = 0, maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                j = Math.max(j, map.get(c) + 1);
            }
            map.put(c, i);
            maxLen = Math.max(maxLen, i - j + 1);
        }

        return maxLen;
    }
}
```

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, ans = 0;
        HashSet<Character> set = new HashSet<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans = Math.max(ans, right-left + 1);
            right++;
        }
        return ans;
    }
}
```

## binary subarrays with sum

LeetCode Question [Link](https://leetcode.com/problems/binary-subarrays-with-sum/)

### 📄 Code:

```java
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return countAtMost(nums, goal) - countAtMost(nums, goal - 1);
    }
    private int countAtMost(int[] nums, int goal) {
        int count = 0, sum = 0, start = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum > goal && start <= end) {
                sum -= nums[start++];
            }
            count += end - start + 1;
        }
        return count;
    }
}

```

## Design Browser History

LeetCode Question [Link](https://leetcode.com/problems/design-browser-history/description/)

### 📄 Code:

```java
class BrowserHistory {
    List<String> history = new ArrayList<>();
    int current = 0;

    public BrowserHistory(String homepage) {
        history.add(homepage);
    }

    public void visit(String url) {
        while (history.size() > current + 1) {
            history.remove(history.size() - 1);
        }
        history.add(url);
        current++;
    }

    public String back(int steps) {
        current = Math.max(0, current - steps);
        return history.get(current);
    }

    public String forward(int steps) {
        current = Math.min(history.size() - 1, current + steps);
        return history.get(current);
    }
}

```

##

LeetCode Question [Link]()

### 📄 Code:

```java

```

##

LeetCode Question [Link]()

### 📄 Code:

```java

```

##

LeetCode Question [Link]()

### 📄 Code:

```java

```
