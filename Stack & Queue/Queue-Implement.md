# Java Programs: Queue Implementation

---

## Queue Implementation

### 📄 File:

```java
class DynamicQueue {

    private int[] arr;
    private int start, end, size;

    public DynamicQueue() {
        arr = new int[2];  
        start = 0;
        end = -1;
        size = 0;
    }

    public void push(int newElement) {
        if (size == arr.length) {
            resize();
        }
        end = (end + 1) % arr.length;
        arr[end] = newElement;
        size++;
        System.out.println("Pushed: " + newElement);
    }

    private void resize() {
        int newCapacity = arr.length * 2;
        int[] newArr = new int[newCapacity];
        
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(start + i) % arr.length];
        }

        arr = newArr;
        start = 0;
        end = size - 1;

        System.out.println("Resized array to capacity " + newCapacity);
    }

    public int pop() {
        if (size == 0) {
            System.out.println("Queue underflow");
            return -1;
        }
        int val = arr[start];
        start = (start + 1) % arr.length;
        size--;
        return val;
    }

    public int top() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[start];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class TUF {
    public static void main(String[] args) {
        DynamicQueue q = new DynamicQueue();

        q.push(10);
        q.push(20);
        q.push(30);  
        q.push(40);
        q.push(50);  

        System.out.println("Front: " + q.top());
        System.out.println("Dequeued: " + q.pop());
        System.out.println("Front after dequeue: " + q.top());
        System.out.println("Size: " + q.size());
    }
}
```
