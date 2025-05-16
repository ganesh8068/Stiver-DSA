# Java Programs: Reverse Number, Selection Sort, and Bubble Sort

This repository contains three basic Java programs:

1. **Reverse a Number**
2. **Selection Sort**
3. **Bubble Sort**

Each program demonstrates core programming concepts in Java such as loops, arrays, conditional statements, and user input.

---

## 1️⃣ Reverse a Number

### 📄 File:
```java
class Main {
    public static void main(String args[]) {
        int num = 12345;
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans); // Output: 54321
    }
}


## 2️⃣ Selection Sort
import java.util.*;

class SelectionSort {
    void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SelectionSort sorter = new SelectionSort();
        sorter.selectionSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}


// bubble sort
import java.util.*;

class BubbleSort {
    void bubblesort (int arr[], int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= n - 2; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        BubbleSort obj = new BubbleSort();
        obj.bubblesort(arr, n);
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        
    }
}