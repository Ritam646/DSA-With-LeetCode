class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int i = 0;i<accounts.length;i++){
            int sumAccount = 0;
            for(int j=0;j<accounts[i].length;j++){
                sumAccount = sumAccount+accounts[i][j];
            }
            if(sumAccount>ans){
                ans = sumAccount;
            }

        }
        return ans;
    }
}