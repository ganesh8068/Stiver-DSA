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

##  Maximum Depth of Binary Tree
Leetcode Question [Link](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
### 📄 File:
```java
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int lh = maxDepth(root.left);
        int lr = maxDepth(root.right);
        return 1 + Math.max(lh, lr);
    }
}
```

##  Balanced Binary Tree
Leetcode Question [Link](https://leetcode.com/problems/balanced-binary-tree/)
### 📄 File:
```java
class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfsHeight (root) != -1;
    }
    int dfsHeight(TreeNode root) {
        if (root == null) return 0;

        int lh = dfsHeight(root.left);
        if (lh == -1) return -1;

        int rh = dfsHeight(root.right);
        if (rh == -1) return -1;

        if(Math.abs(lh - rh) > 1) return -1;
        return 1 + Math.max(lh, rh);
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



