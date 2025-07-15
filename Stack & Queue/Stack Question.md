# Java Programs: Stack Question

---

Operator Precedence Table (High to Low)  
Precedence	Operators	Description	Associativity  
1)  ()	Parentheses	Left to Right  
2)  ^	Exponentiation	Right to Left  
3)  *, /, %	Multiplication, Division, Modulus	Left to Right  
4)	+, -	Addition, Subtraction	Left to Right  
5)  =	Assignment	Right to Left  

##  Min Stack
Leetcode Question [link](https://leetcode.com/problems/min-stack/)

### 📄 File:
```java
class MinStack {
    private Stack <int[]> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if (st.isEmpty()) {
            st.push(new int[] {val, val} );
        } else {
            int currentMin = st.peek()[1];
            st.push(new int [] {val, Math.min(val, currentMin)} );
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek()[0];
    }
    
    public int getMin() {
        return st.peek()[1];   
    }
}
```


##  Trapping Rain Water
LeetCode Question [Link](https://leetcode.com/problems/trapping-rain-water/description/)
### 📄 File:
```java
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax [] = new int [n];
        int rightMax [] = new int [n];

        int maxL = 0;
        for (int i = 0; i < n; i++) {
            leftMax[i] = maxL;
            maxL = Math.max(maxL, height[i]);
        }

        int maxR = 0;
        for (int i = n - 1; i >= 0; i--) {
            rightMax[i] = maxR;
            maxR = Math.max(maxR, height[i]);
        }

        int water = 0;
        for (int i = 0; i < n; i++) {
            int trap = Math.min(leftMax[i], rightMax[i]) - height[i];
            if (trap > 0) {
                water += trap;
            }
        }
        return water;

    }
}
```


##  Next Greater Element II
LeetCode Question [Link](https://leetcode.com/problems/next-greater-element-ii/description/)
### 📄 File:
```java
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Stack < Integer > st = new Stack < > ();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (!st.isEmpty()) ans[i] = st.peek();
                else ans[i] = -1;
            }

            st.push(nums[i % n]);
        }
        return ans;

        // for (int i = 0; i < n; i++) {
        //     ans[i] = -1;  
        //     for (int j = 1; j < n; j++) { 
        //         int next = nums[(i + j) % n];
        //         if (next > nums[i]) {
        //             ans[i] = next;
        //             break;
        //         }
        //     }
        // }
        // return ans;
    }
}

```

##  sum of subarray minimums
LeetCode Question [Link](https://leetcode.com/problems/sum-of-subarray-minimums/description/)
### 📄 File:
```java
Brute Force Approach

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int mod = (int) (1e9 + 7);

        for (int i = 0; i < n; i++) {
            int mini = arr[i];
            for (int j = i; j < n; j++) {
                mini = Math.min(mini, arr[j]);
                sum = (sum + mini) % mod;
            }
        }

        return sum;
    }
}

```


##  Aestroid Collisions
LeetCode Question [Link](https://leetcode.com/problems/asteroid-collision/description/)
### 📄 File:
```java
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int current = asteroids[i];
            boolean alive = true;

            while (!st.isEmpty() && current < 0 && st.peek() > 0) {
                if (st.peek() < -current) {
                    st.pop();
                } else if (st.peek() == -current) {
                    st.pop();  
                    alive = false;
                    break;
                } else {
                    alive = false;
                    break;
                }
            }

            if (alive) {
                st.push(current);
            }
        }

        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}

```


##  Remove-K-Digits
LeetCode Question [Link](https://leetcode.com/problems/remove-k-digits/description/)
### 📄 File:
```java
class Solution {
    public String removeKdigits(String num, int k) {
        if(k >= num.length()) return "0";

        char arr[] = num.toCharArray();
        int i = 0;
        for(char c : arr){
            while(k > 0 && i > 0 && arr[i-1] > c){
                i--;
                k--;
            }
            arr[i++] = c;
        }
        int l = i - k;
        int j = 0;
        while(j < l && arr[j] == '0'){
            j++;
        }

        if(j == l) return "0";

        return new String(arr, j, l - j);
    }
}
```

##  Sliding window maximum
LeetCode Question [Link](https://leetcode.com/problems/sliding-window-maximum/submissions/)
### 📄 File:
```java
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            if (i >= k - 1) {
                result.add(nums[dq.peekFirst()]);
            }
        }

        int[] resArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resArray[i] = result.get(i);
        }

        return resArray;
    }
}
```


##  
LeetCode Question [Link]()
### 📄 File:
```java

```


##  
LeetCode Question [Link]()
### 📄 File:
```java

```