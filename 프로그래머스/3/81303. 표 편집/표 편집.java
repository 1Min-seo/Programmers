import java.util.*;
class Solution {
    static class Node { 
        int index;
        Node prev, next;
        Node(int index) {
            this.index = index;
        }
    }
    public String solution(int n, int k, String[] cmd) {
        Node[] nodes = new Node[n];
        for(int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
            if(i > 0) {
                nodes[i].prev = nodes[i - 1];
                nodes[i - 1].next = nodes[i];
            }
        }
        
        Node cursor = nodes[k];
        Stack<Node> deleted = new Stack<>();
        
        for(String command : cmd) {
            char c = command.charAt(0);
            
            if(c == 'U') {
                int x = Integer.parseInt(command.substring(2));
                for(int i = 0; i < x; i++) {
                    cursor = cursor.prev;
                }
            }else if(c == 'D') {
                int x = Integer.parseInt(command.substring(2));
                for(int i = 0; i < x; i++) {
                    cursor = cursor.next;
                }
            }else if(c == 'C') {
                deleted.push(cursor);
                if(cursor.prev != null) cursor.prev.next = cursor.next;
                if(cursor.next != null) cursor.next.prev = cursor.prev;
                
                cursor = (cursor.next != null) ? cursor.next : cursor.prev;
            }else if(c == 'Z') {
                Node node = deleted.pop();
                if(node.prev != null) node.prev.next = node;
                if(node.next != null) node.next.prev = node;
            }
        }
        
        StringBuilder sb = new StringBuilder("O".repeat(n));
        while(!deleted.isEmpty()) {
            sb.setCharAt(deleted.pop().index, 'X');
        }
        
        return sb.toString();
    }
}

/**
삭제된거 복구는 스택 이용
*/