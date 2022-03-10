class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        list1=list(heights)
        list1.sort()
        counter=0
        size=len(list1)
        for i in range(0,size):
            if heights[i]!=list1[i]:
                counter +=1
        return counter        
                