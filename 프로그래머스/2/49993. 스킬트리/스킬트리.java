class Solution {
    public int solution(String skill, String[] skill_trees) {
        int count = 0;
        
        for(String tree : skill_trees) {
            StringBuilder sb = new StringBuilder();
            
            for(int i = 0; i < tree.length(); i++) {
                char c = tree.charAt(i);
                if(skill.contains(String.valueOf(c))) {
                    sb.append(c);
                }
            }
            
            if(skill.startsWith(sb.toString())) {
                count++;
            }
        }
        return count;
    }
}