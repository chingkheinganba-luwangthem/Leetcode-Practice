class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        boolean[] seen = new boolean[n + 1];
        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            if (seen[A[i]]) {
                commonCount++;
            } else {
                seen[A[i]] = true;
            }

            if (seen[B[i]]) {
                commonCount++;
            } else {
                seen[B[i]] = true;
            }

            ans[i] = commonCount;
        }
        return ans;
    }
}
