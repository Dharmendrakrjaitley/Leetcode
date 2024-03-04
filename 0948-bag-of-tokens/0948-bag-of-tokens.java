class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        int left=0;
        int right=tokens.length-1;
        int score=0;
        int tempScore=0;
        while(left<=right)
        {
            if(tokens[left]<= power)
            {
                tempScore++;
                power-=tokens[left];
                left++;
                score=Math.max(score,tempScore);
            }
            else if(tempScore>0)
            {
                power+=tokens[right];
                right--;
                tempScore--;
                score=Math.max(score,tempScore);
            }
            else
                break;
            
        }
        return score;
    }
}