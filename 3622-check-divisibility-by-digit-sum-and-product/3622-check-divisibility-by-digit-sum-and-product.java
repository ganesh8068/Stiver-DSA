class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, prod = 1;
        
        // Loop through each character of the number string
        for (char c : String.valueOf(Math.abs(n)).toCharArray()) {
            int digit = c - '0'; // Convert character to actual number
            sum += digit;
            prod *= digit;
        }
        
        return n % (sum + prod) == 0;
    }
}
