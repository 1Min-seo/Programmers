import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        Set<Character> skillSet = new HashSet<>();
        for(char c : skill.toCharArray()) skillSet.add(c);

        int count = 0;
        for(String tree : skill_trees) {
            StringBuilder filtered = new StringBuilder();
            for(char c : tree.toCharArray()) {
                if(skillSet.contains(c)) filtered.append(c);
            }
            if(skill.startsWith(filtered.toString())) count++;
        }

        return count;
    }
}
