import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map<String, String> member = new HashMap<>();
        ArrayList<String[]> logs = new ArrayList<>();
        
        for(String r : record) {
            String[] parts = r.split(" ");
            String command = parts[0];
            String uid = parts[1];
            
            if(command.equals("Enter")) {
                String name = parts[2];
                member.put(uid, name);
                logs.add(new String[]{uid, "Enter"});
            }else if(command.equals("Change")) {
                String name = parts[2];
                member.put(uid, name);
            }else {
                logs.add(new String[]{uid, "Leave"});
            }
        }
        
        String[] answer = new String[logs.size()];
        for(int i = 0; i < logs.size(); i++) {
            String uid = logs.get(i)[0];
            String action = logs.get(i)[1];
            String name = member.get(uid);
            
            if(action.equals("Enter")) {
                answer[i] = name + "님이 들어왔습니다.";
            }else{
                answer[i] = name + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}
/**

1234    muzi    enter   prodo
4567    prodo   enter   ryan
1234    muzi    leave   prodo
1234    prodo   enter   

*/