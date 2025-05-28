# Java Programs:

---

## Find The Largest Number

### 📄 Code:

```java
class Main {
    public static void main(String args[]) {
        int[] arr = {1, 9, 6, 10, 7};
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element is: " + largest);
    }
}

```

## Second Largest Number

### 📄 Code:

```java
class test {
    public static void main (String args []) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }

        System.out.println(slargest);
    }
}
```

## Check Array is Sorted

### 📄 Code:

```java
class Test {
    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        boolean result = isSorted(arr);

        if (result) {
            System.out.println("Array is sorted in non-decreasing order.");
        } else {
            System.out.println("Array is NOT sorted.");
        }
    }
}
```

## Remove Duplicate

### 📄 Code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       int arr[] = {1,1,2,2,2,3,3,8};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
```

## Left Rotate an array by one place

### 📄 Code:

```java
class Main {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
         
        arr[n-1] = temp;
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}

```

## Left rotate an array by D places

### 📄 Code:

```java
import java.util.*;

class Main {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int d = 2; 

        List<Integer> temp = new ArrayList<>();
        
        for (int i = 0; i < d; i++) {
            temp.add(arr[i]);
        }
        
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        
        for (int i = 0; i < temp.size(); i++) {
            arr[n - d + i] = temp.get(i);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

```java
import java.util.*;

class Main {
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int d = 2;
        
        reverse(arr, 0, d - 1); 
        reverse(arr, d, n - 1); 
        reverse(arr, 0, n - 1); 
        
        // Right Rotate
        // reverse(arr, 0, n-1);
        // reverse(arr, 0, d-1);
        // reverse(arr, d, n-1);
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

```

## Move Zeros to end

### 📄 Code:

```java
class Main {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }
        
        while (j < n) {
            arr[j++] = 0;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

```

## Linear Search

### 📄 Code:

```java

```


## Find the Union

### 📄 Code:

```java

```

## Find missing number in an array

### 📄 Code:

```java

```

## Maximum Consecutive Ones

### 📄 Code:

```java

```

## Find the number that appears once, and other numbers twice

### 📄 Code:

```java

```

## Longest subarray with given sum K(positives)

### 📄 Code:

```java

```

## Longest subarray with sum K (Positives + Negatives)

### 📄 Code:

```java

```
