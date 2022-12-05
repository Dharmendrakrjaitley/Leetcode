class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<2) return false;
        //int k=2;
        int i=0;
        int j=i+1;
        for(int k=2;k<arr.length;k++)
        {
            if(((arr[i]%2!=0 && arr[j]%2!=0) && (arr[k])%2!=0 )) return true;
            else
            {
                i++;
                j=i+1;
            }
        }
        return false;
    }
}