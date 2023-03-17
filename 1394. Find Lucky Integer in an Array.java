class Solution {
    public int findLucky(int[] arr) {
        int [] lucky = new int[501];
        int res=-1;
        for(int i=0; i<arr.length; i++)
            lucky[arr[i]]++;
        for(int i=1; i<501; i++) {
            if(lucky[i]==i)
                res=i;
        }
        return res;
    }
}