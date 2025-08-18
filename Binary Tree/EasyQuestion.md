# Java Programs: Binary Tree Easy Question

---

## Binary Tree Preorder Traversal

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

## Maximum Depth of Binary Tree

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

## Balanced Binary Tree

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

## Diameter of Binary Tree

Leetcode Question [Link](https://leetcode.com/problems/diameter-of-binary-tree/description/)

### 📄 File:

```java
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter[] = new int[1];
        height (root, diameter);
        return diameter[0];
    }

    int height(TreeNode root, int diameter[]) {
        if (root == null) return 0;
        int lh = height(root.left, diameter);
        int rh = height(root.right, diameter);
        diameter[0] = Math.max(diameter[0], lh +  rh);
        return 1 + Math.max(lh, rh);
    }
}
```

## Binary Tree Maximum Path Sum

Leetcode Question [Link](https://leetcode.com/problems/binary-tree-maximum-path-sum/)

### 📄 File:

```java
class Solution {
    public int maxPathSum(TreeNode root) {
        int[] res = { root.val };
        dfs(root, res);
        return res[0];
    }

    private int dfs(TreeNode node, int[] res) {
        if (node == null) return 0;
        int left = Math.max(0, dfs(node.left, res));
        int right = Math.max(0, dfs(node.right, res));
        res[0] = Math.max(res[0], left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
```

## Same Tree

Leetcode Question [Link](https://leetcode.com/problems/same-tree/description/)

### 📄 File:

```java
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return (p==q);
        return (p.val == q.val) &&
        isSameTree(p.left, q.left) &&
        isSameTree(p.right, q.right);
    }
}
```

## Symmetric Tree

Leetcode Question [Link](https://leetcode.com/problems/symmetric-tree/description/)

### 📄 File:

```java
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricHelp(root.left, root.right);
    }

    boolean isSymmetricHelp(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;
        if (left.val != right.val) return false;
        return isSymmetricHelp(left.left, right.right) &&
               isSymmetricHelp(left.right, right.left);
    }
}
```

## Count Total Tree Nodes

Leetcode Question [Link](https://leetcode.com/problems/count-complete-tree-nodes/description/)

### 📄 File:

```java
class Solution {
    public int countNodes(TreeNode root) {
        List <Integer> res = new ArrayList<>();
        inorder(root, res);
        return res.size();
    }

    void inorder (TreeNode root, List <Integer> res) {
        if (root == null) return;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}
```

## Morris Traversal

Leetcode Question [Link](https://leetcode.com/problems/binary-tree-inorder-traversal/description/)

### 📄 File:

```java
Using Inorder Traversal

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
    void inorder(TreeNode root, List <Integer> res) {
        if (root == null) return;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }

        return res;
    } 
}
```
