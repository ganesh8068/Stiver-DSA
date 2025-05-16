# Java Programs: Reverse Number

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
```