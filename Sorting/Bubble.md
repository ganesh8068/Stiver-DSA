# Java Programs: Bubble Sort

---

##  Bubble Sort

### 📄 File:
```java
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
```
