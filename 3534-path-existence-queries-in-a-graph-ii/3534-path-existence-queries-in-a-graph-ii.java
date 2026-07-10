class Solution {
    public int[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {

        int[][] sortedNums = new int[n][2];
        for (int i = 0; i < n; i++) {
            sortedNums[i][0] = nums[i];
            sortedNums[i][1] = i;
        }

        Arrays.sort(sortedNums, Comparator.comparingInt(a -> a[0]));

        int[] point = new int[n];
        for (int i = 0; i < n; i++) {
            point[sortedNums[i][1]] = i;
        }

        int[] up = new int[n + 1];
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j + 1 < n && sortedNums[j + 1][0] - sortedNums[i][0] <= maxDiff) {
                j++;
            }
            if (j < i) j = i;
            up[i] = j;
        }

        int temp = n;
        int k = 0;
        while (temp != 0) {
            k++;
            temp /= 2;
        }

        int[][] dp = new int[n + 1][k + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = up[i];
        }

        for (int col = 1; col < k; col++) {
            for (int i = 0; i < n; i++) {
                dp[i][col] = dp[dp[i][col - 1]][col - 1];
            }
        }

        int[] ans = new int[queries.length];
        int idx = 0;

        for (int[] q : queries) {
            int u = q[0], v = q[1];

            if (u == v) {
                ans[idx++] = 0;
                continue;
            }

            int st = Math.min(point[u], point[v]);
            int en = Math.max(point[u], point[v]);

            if (up[st] == st) {
                ans[idx++] = -1;
                continue;
            }

            int node = st;
            int step = 0;

            for (int i = k - 1; i >= 0; i--) {
                if (dp[node][i] < en) {
                    node = dp[node][i];
                    step += (1 << i);
                }
            }

            if (up[node] < en)
                ans[idx++] = -1;
            else
                ans[idx++] = step + 1;
        }

        return ans;
    }
}