# Java Programs: Binary Tree Medium Question

---

## Binary Tree Level Order Traversal

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

## Top view of Binary Tree

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

## Right View

Leetcode Question [Link](https://leetcode.com/problems/binary-tree-right-side-view/description/)

### 📄 File:

```java
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List <Integer> res = new ArrayList<>();
        rView(root, 0, res);
        return res;
    }

    void rView(TreeNode root, int level, List <Integer> res) {
        if (root == null) return;
        if (level == res.size()) res.add(root.val);
        rView(root.right, level + 1, res);
        rView(root.left, level + 1, res);
    }
}
```

## Lowest Common Ancestor of a Binary Tree

Leetcode Question [Link](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/)

### 📄 File:

```java
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null) return right;
        else if (right == null) return left;
        else return root;
    }
}
```

## Maximum Width of Binary Tree

Leetcode Question [Link](https://leetcode.com/problems/maximum-width-of-binary-tree/description/)

### 📄 File:

```java
class Solution {
    int maxWidth = 0;
    public int widthOfBinaryTree(TreeNode root) {
        List <Integer> res = new ArrayList<>();
        dfs (root, 0, 1, res);
        return maxWidth;
    }

    private void dfs (TreeNode root, int level, int index, List <Integer> res) {
        if (root == null) return;
        if (level == res.size()) res.add(index);

        int width = index - res.get(level) + 1;
        maxWidth = Math.max(maxWidth, width);

        dfs(root.left, level + 1, 2 * index, res);
        dfs(root.right, level + 1, 2 * index + 1, res);
    }
}
```

## Flatten a Binary Tree to Linked List

Leetcode Question [Link](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/)

### 📄 File:

```java

class Solution {
    TreeNode head = null;
    public void flatten(TreeNode root) {
        if (root != null) revPreOrder(root);
    }
    private void revPreOrder(TreeNode node) {
        if (node.right != null) revPreOrder(node.right);
        if (node.left != null) revPreOrder(node.left);
        node.left = null;
        node.right = head;
        head = node;
    }
}


class Solution {
    TreeNode previous = null;

    public void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.right);
        flatten(root.left);

        root.right = previous;
        root.left = null;

        previous = root;
    }
}
```
