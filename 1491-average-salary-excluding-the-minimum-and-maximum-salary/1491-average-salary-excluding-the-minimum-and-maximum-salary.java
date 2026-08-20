class Solution {
    public double average(int[] salary) {
        // int n = salary.length;
        // int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;;
        // for (int i = 0; i < n; i++) {
        //     min = Math.min(min, salary[i]);
        //     max = Math.max(max, salary[i]);
        // }
        // int add = 0, div = 0;
        // for (int i = 0; i < n; i++) {
        //     if (salary[i] != max && salary[i] != min) {
        //         add += salary[i];
        //         div++;
        //     }
        // }
        // return (double) add / div;

        // optimal solution
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < salary.length; i++) {
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
            sum += salary[i];
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }
}