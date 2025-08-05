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

## Binary Tree Zigzag Level Order Traversal
Leetcode Question [Link](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/)
### 📄 File:
```java
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List <List<Integer>> ans = new ArrayList<>();
        order(root, 0, ans);
        return ans;
    }
    void order (TreeNode root, int level, List <List<Integer>> ans) {
        if (root == null) return;
        if (ans.size() == level) ans.add(new ArrayList<>());
        if (level % 2 == 0) {
            ans.get(level).add(root.val);
        } else {
            ans.get(level).add(0, root.val);
        }
        order(root.left, level + 1, ans);
        order(root.right, level + 1, ans);
    }
}
```

##  Top view of Binary Tree
Leetcode Question [Link]()
### 📄 File:
```java
import java.util.*;

class Solution {
    public static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Map<Integer, Integer> map = new TreeMap<>(); 
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0)); 

        while (!q.isEmpty()) {
            Pair it = q.poll();
            int hd = it.hd;
            Node temp = it.node;

            if (!map.containsKey(hd)) {
                map.put(hd, temp.data);
            }

            if (temp.left != null) {
                q.add(new Pair(temp.left, hd - 1));
            }

            if (temp.right != null) {
                q.add(new Pair(temp.right, hd + 1));
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }

    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
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



