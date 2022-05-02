class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& A) {
        int size=A.size();
        
        int read=0;
        int write=0;
        for(read=0;read<size;read++)
        {
            if(A[read]%2==0)
            {
                int temp=A[write];
                A[write++]=A[read];
                A[read]=temp;
            }
        }
         
        return A;
    }
};