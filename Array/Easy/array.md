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

```java
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
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
class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int num = 9;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = arr[i];
                break;
            } 
        }
        System.out.println(index);
    }
}
```


## Find the Union

### 📄 Code:

```java
import java.util.*;

class TUF {
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> Union = new ArrayList<>(); 

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }

        while (i < n) {
            if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }

        while (j < m) {
            if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }

        return Union;
    }

    public static void main(String args[]) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};

        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is:");
        for (int val : Union)
            System.out.print(val + " ");
    }
}

```

## Find missing number in an array

### 📄 Code:

```java
class Main {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 5, 6};
        int xorArr = 0, xorFull = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            xorArr ^= arr[i];
        }

        for (int i = ; i <= n; i++) {
            xorFull ^= i;
        }

        int missing = xorArr ^ xorFull;
        System.out.println("Missing number is: " + missing);
    }
}
```

## Maximum Consecutive Ones

### 📄 Code:

```java
public class Solution {
    public int MaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = sol.MaxConsecutiveOnes(nums);
        System.out.println("Max consecutive 1s: " + result);
    }
}

```

## Find the number that appears once, and other numbers twice

### 📄 Code:

```java
class Main {
    public static void main(String args[]) {
        int arr[] = {2,2,1};
        int xor = 0;
        
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        
        System.out.println(xor);
    }
}
```

## Longest subarray with given sum K(positives)

### 📄 Code:

```java

```

## Longest subarray with sum K (Positives + Negatives)

### 📄 Code:

```java

```
