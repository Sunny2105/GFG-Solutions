class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int i=0,j=0,max_sum=-1,sum=0;
        while(j<arr.length){
            sum +=arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max_sum =Math.max(max_sum,sum);
                sum-=arr[i];
                i++;
                j++;
            }
        }
        return max_sum;
    }
}