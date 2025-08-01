# Java Programs: Binary Tree Medium Question
---


##  Binary Tree Level Order Traversal
Leetcode Question [Link](https://leetcode.com/problems/binary-tree-level-order-traversal/)
### 📄 File:
```java
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List <List<Integer>> res = new ArrayList<>();
        order(root, 0, res);
        return res;
    }

    void order(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) return;
        if (level == res.size()) res.add(new ArrayList<>());
        res.get(level).add(root.val);
        order(root.left, level + 1, res);
        order(root.right, level + 1, res);
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

##  
Leetcode Question [Link]()
### 📄 File:
```java

```



