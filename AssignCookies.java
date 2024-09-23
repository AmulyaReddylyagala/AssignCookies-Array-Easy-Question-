class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
       int j= s.length - 1;
        int i = g.length - 1;
        int result = 0;
        while(j >= 0 && i >= 0){
            if(g[i] <= s[j]){
                result++;
                j--;
            }
            i--;
        }
        return result;    
    }
}