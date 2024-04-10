class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        int[] result = new int[n];
        Queue<Integer> que = new LinkedList<>();
        for (int ele : deck)
            que.add(ele);

        for (int i = 0; i < n; i = i + 2)
            result[i] = que.remove();

        int count = 1;
        while (!que.isEmpty()) {
            for (int i = 0; i < n; i++) {
                if (result[i] == 0) {
                    if (que.size() == 1) {
                        result[i] = que.remove();
                        break;
                    }
                    if (n % 2 == 0) {
                        if (count % 2 == 0)
                            count++;
                        else {
                            result[i] = que.remove();
                            count++;
                        }
                    } else {
                        if (count % 2 != 0)
                            count++;
                        else {
                            result[i] = que.remove();
                            count++;
                        }
                    }

                }
            }
        }
        return result;
    
    }
}