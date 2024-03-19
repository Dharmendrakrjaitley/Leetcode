class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new int[26];
        for(char c: tasks){
            freq[c-'A']++;
        }
        Arrays.sort(freq);
        int in_between = --freq[25];
        int vacant_solts = in_between*n;

        for(int i=0;i<25;i++){
            vacant_solts -= Math.min(in_between, freq[i]);
        }
        return vacant_solts<0 ? tasks.length : tasks.length + vacant_solts;
    }
}