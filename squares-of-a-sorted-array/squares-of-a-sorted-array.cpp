class Solution {
public:
    vector<int> sortedSquares(vector<int>& A) {
        int size=A.size();
        vector<int> v;
        vector<int>::iterator it;
        it=v.begin();
        for(int i=0;i<size;i++)
        {
           int j=(A.at(i)*A.at(i));
            v.push_back(j);
        }
        sort(v.begin(),v.end());
        return v;
        // for(int i=0;i<size;i++)
        // {
        //     cout<<A.at(i)<<" ";
        // }
    }
};