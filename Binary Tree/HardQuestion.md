# Java Programs: Binary Tree Hard Question

---

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
