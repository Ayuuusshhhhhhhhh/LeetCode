class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Double.NEGATIVE_INFINITY;
        int n = nums.length;
        double avg;
        for (int l=0; l<=n-k; l++){
            int Nsum = 0;
            int r = l+k-1;
            for (int i=l; i<=r; i++){
                Nsum += nums[i];
            }
            avg = (double) Nsum/k;
            maxAvg = Math.max(maxAvg, avg);
        }
            return maxAvg;
    }
}