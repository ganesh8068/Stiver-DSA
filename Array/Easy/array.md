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

##

### 📄 Code:

```java

```
