# Java Programs: Quick Sort

---

## Quick Sort

### 📄 File:

```java
import java.util.*;

class Sort {
  void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  int partition(int arr[], int low, int high) {
    int pivot = arr[low];
    int i = low + 1;
    int j = high;

    while (i <= j) {
      while (i <= high && arr[i] <= pivot) i++;
      while (j >= low && arr[j] > pivot) j--;
        
      if (i < j) {
        swap(arr, i, j);
        }
      }
      swap(arr, low, j);
      return j;
  }
    
  void qs(int arr[], int low, int high) {
    if (low < high) {
      int pIndex = partition(arr, low, high);
      qs(arr, low, pIndex - 1);
      qs(arr, pIndex + 1, high);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Sort obj = new Sort();
    obj.qs(arr, 0, arr.length - 1);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}



```
