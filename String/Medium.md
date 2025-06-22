# Java Programs: String Medium Question
---


##  Longest Substring Without Repeating Characters
Leetcode Question [Link](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
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

  // Second Approach
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



##  Group Anagrams
Leetcode Question [Link](https://leetcode.com/problems/group-anagrams/)
### 📄 File:
```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int[] count = new int[26];

            for (int j = 0; j < strs[i].length(); j++) {
                count[strs[i].charAt(j) - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int c = 0; c < 26; c++) {
                sb.append(count[c]);
                sb.append('#');  
            }
            String key = sb.toString();

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(strs[i]);
        }

        return new ArrayList<List<String>>(map.values());
    }
}

```



##  Longest Palindrome
Leetcode Question [Link](https://leetcode.com/problems/longest-palindromic-substring/)
### 📄 File:
```java
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);  
            int len = Math.max(len1, len2);
            if (len > (end - start)) {
                start = i - (len - 1) / 2;  
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

   private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}

```



##  Palindromic substrings
Leetcode Question [Link](https://leetcode.com/problems/palindromic-substrings/)
### 📄 File:
```java
class Solution {
    public int countSubstrings(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            ans += check(s, i, i);
            ans += check(s, i, i + 1);
        }
        return ans;
    }

    public static int check (String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            count++;
        }
        return count;
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