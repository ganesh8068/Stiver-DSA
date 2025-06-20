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


##  
Leetcode Question [Link]()
### 📄 File:
```java

```