# Java Programs: Binary Tree Easy Question
---


##  Binary Tree Preorder Traversal
Leetcode Question [Link]()
### 📄 File:
```java
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;        
    }

    private void preorder(TreeNode node, List<Integer> res) {
        if (node == null) return;
        res.add(node.val);
        preorder(node.left, res);
        preorder(node.right, res);
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



