# Java Programs: Binary Search Tree Question

---

## Search in a Binary Search Tree 

Leetcode Question [Link](https://leetcode.com/problems/search-in-a-binary-search-tree/description/)

### 📄 File:

```java
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }
}
```

## Insert Node in Binary Search Tree

Leetcode Question [Link](https://leetcode.com/problems/insert-into-a-binary-search-tree/description/)

### 📄 File:

```java
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        TreeNode curr = root;
        while (true) {
            if (curr.val < val) {
                if (curr.right != null) curr = curr.right;
                else {
                    curr.right = new TreeNode(val);
                    break;
                }
            } else {
                if (curr.left != null) curr = curr.left;
                else {
                    curr.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}
```

## Delete a Node in Binary Search Tree 

Leetcode Question [Link](https://leetcode.com/problems/delete-node-in-a-bst/description/)

### 📄 File:

```java
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key) return helper(root);

        TreeNode dummy = root;
        while (root != null) {
            if (root.val > key) {
                if (root.left != null && root.left.val == key) {
                    root.left = helper(root.left);
                    break;
                } else {
                    root = root.left;
                }
            } else {
                if (root.right != null && root.right.val == key) {
                    root.right = helper(root.right);
                    break;
                } else {
                    root = root.right;
                }
            }
        }
        return dummy;
    }

    private TreeNode helper(TreeNode root) {
        if (root.left == null) return root.right;
        if (root.right == null) return root.left;

        TreeNode rightChild = root.right;
        TreeNode lastRight = findLastRight(root.left);
        lastRight.right = rightChild;
        return root.left;
    }

    private TreeNode findLastRight(TreeNode root) {
        if (root.right == null) return root;
        return findLastRight(root.right);
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
