class Solution {
public:
    vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int k) {
        
        int n=grid.size();
        int m=grid[0].size();
        
        vector<vector<int>> result(n,vector<int>(m));
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int newJ= (j+k)%m;
                int newI= (i+ (j+k)/m)%n;
                result[newI][newJ]=grid[i][j];
            }
        }
        
        return result;
    }
};