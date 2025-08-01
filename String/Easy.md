# Java Programs: String Easy Question
---

##  Reverse words in a given string / Palindrome Check
LeetCode Question [Link](https://leetcode.com/problems/reverse-words-in-a-string/)
### 📄 File:
```java
class Solution {
    public String reverseWords(String s) {
        String words [] = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) {
                res.append(" ");
            }
        }
        return res.toString().trim();
    }
}
```

##  Largest Odd Number in String
Leetcode Question [Link](https://leetcode.com/problems/largest-odd-number-in-string/description/)
### 📄 File:
```java
class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if (c % 2 == 1) { 
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
```


##  check if the sentence is pangram
Leetcode Question [Link](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
### 📄 File:
```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        int arr [] = new int[26];
        for (int i = 0; i < n; i++) {
            char ch = sentence.charAt(i);
            int index = ch - 'a';
            arr[index]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) return false;
        }
        return true;
    }
}
```


##  Longest Common Prefix
Leetcode Question [Link](https://leetcode.com/problems/longest-common-prefix/description/)
### 📄 File:
```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
```



##  Fizz Buzz 
Leetcode Question [Link](https://leetcode.com/problems/fizz-buzz/description/)
### 📄 File:
```java
class Solution {
    public List<String> fizzBuzz(int n) {
        List <String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ( i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }
}
```



##  Valid Anagram
Leetcode Question [Link](https://leetcode.com/problems/valid-anagram/description/)
### 📄 File:
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
```



##  valid Parentheses
Leetcode Question [Link](https://leetcode.com/problems/valid-parentheses/description/)
### 📄 File:
```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != ch) return false;
            }
        }
        return stack.isEmpty();
    }
}

```



##  Valid Palindrome
Leetcode Question [Link](https://leetcode.com/problems/valid-palindrome/)
### 📄 File:
```java
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        while (left < right) { 
            if (s.charAt(left) != s.charAt(right)) return false;  
            left++;
            right--;
        }
        return true;  
    }
}

```


##  Length of Last Word
Leetcode Question [Link](https://leetcode.com/problems/length-of-last-word/description)
### 📄 File:
```java
class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ' && ans > 0) break;
            else if(s.charAt(i) != ' ') ans++;
        }
        return ans;
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