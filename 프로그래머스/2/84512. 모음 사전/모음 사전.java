class Solution {
    String[] letters = {"A", "E", "I", "O", "U"};
    int answer = 0;
    int count = 0;
    public int solution(String word) {
        dfs("", word);
        return answer;
    }
    
    private void dfs(String current, String target) {
        if(current.equals(target)) {
            answer = count;
            return;
        }
        
        if(current.length() >= 5) return;
        
        for(int i = 0; i < letters.length; i++) {
            count++;
            dfs(current + letters[i], target);
            //if(answer != 0) return;
        }
    }
}