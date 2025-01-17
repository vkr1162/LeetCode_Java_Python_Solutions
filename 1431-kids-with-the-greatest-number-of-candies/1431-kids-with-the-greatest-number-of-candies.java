class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max= 1;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        int diff = max-extraCandies;
        List<Boolean> ans = new ArrayList();
        for(int i=0;i<candies.length;i++){
            if(diff<=candies[i]){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}