# Java Programs: LinkList question

---

##  Insertion, Deletion in LinkList
 
### 📄 File:
```java
import java.util.List;
import java.util.Arrays;

// Node class to represent a linked list node
class Node {
    public int data;
    public Node next;

    public Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    public Node(int data1) {
        data = data1;
        next = null;
    }
}

public class Main {

    // Insert at head
    public static Node insertHead(Node head, int val) {
        Node temp = new Node(val, head);
        return temp;
    }

    // Insert at end
    public static Node insertEnd(Node head, int val) {
        Node newNode = new Node(val);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    // Remove from head
    public static Node removeHead(Node head) {
        if (head == null) {
            System.out.println("List is already empty.");
            return null;
        }
        return head.next;
    }

    // Remove from end
    public static Node removeEnd(Node head) {
        if (head == null) {
            System.out.println("List is already empty.");
            return null;
        }
        if (head.next == null) {
            return null; // Only one element
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    // Print the linked list
    public static void printLL(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);
        Node head = null;

        // Build initial list
        for (int val : arr) {
            head = insertEnd(head, val);
        }

        System.out.print("Initial list: ");
        printLL(head);

        // Insert at head
        head = insertHead(head, 100);
        System.out.print("After insertHead(100): ");
        printLL(head);

        // Insert at end
        head = insertEnd(head, 999);
        System.out.print("After insertEnd(999): ");
        printLL(head);

        // Remove from head
        head = removeHead(head);
        System.out.print("After removeHead(): ");
        printLL(head);

        // Remove from end
        head = removeEnd(head);
        System.out.print("After removeEnd(): ");
        printLL(head);
    }
}

```
