# Java Programs: Stack Implementation

---

## Stack Implementation

### 📄 File:

```java
public class tuf {

    public static void main(String[] args) {

        stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);

        System.out.println("Top of the stack before deleting any element: " + s.top());
        System.out.println("Size of the stack before deleting any element: " + s.size());
        System.out.println("The element deleted is: " + s.pop());
        System.out.println("Size of the stack after deleting an element: " + s.size());
        System.out.println("Top of the stack after deleting an element: " + s.top());
    }
}

class stack {
    public int arr[] = new int[1];
    public int top = -1;

    void push(int x) {
        if (top + 1 == arr.length) {
            resize();
        }
        top++;
        arr[top] = x;
    }

    void resize() {
        int newSize = arr.length + 1;
        int newArr[] = new int[newSize];
        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int x = arr[top];
        top--;
        return x;
    }

    int size() {
        // Return 0 if empty, no error code here
        return top + 1;
    }

    int top() {
        if (top == -1) {
            System.out.println("Stack empty");
            return -1;
        }
        return arr[top];
    }
}

```
