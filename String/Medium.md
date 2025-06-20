# Java Programs: String Medium Question
---


##  Longest Repeating Character Replacement
Leetcode Question [Link]()
### 📄 File:
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
      ans = Math.max(ans, right - left + 1);
      right++;
    }  
    return ans;
  }


  public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int left = 0, maxLen = 0;

    for (int right = 0; right < s.length(); right++) {
      char c = s.charAt(right);
      if (map.containsKey(c)) {
        left = Math.max(left, map.get(c) + 1);
        }
        map.put(c, right);
        maxLen = Math.max(maxLen, right - left + 1);
    }
    return maxLen;
  }
}


```



##  
Leetcode Question [Link]()
### 📄 File:
```java

```



##  
Leetcode Question [Link]()
### 📄 File:
```java

```



##  
Leetcode Question [Link]()
### 📄 File:
```java

```