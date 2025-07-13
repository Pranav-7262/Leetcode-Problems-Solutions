class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int s1 = players.length;
        int s2 = trainers.length;
        int a = 0;
        int b = 0;
        int ans = 0;

        while(a<s1 && b<s2) {
            if(players[a] <= trainers[b]) {
                a++;
                b++;
                ans++;
            }
            else{
                b++;
            }

        }
        return ans;
    }
}