/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;

        while(cur != null && cur.next != null){
            int newVal = gcd(cur.val, cur.next.val);
            ListNode newNode = new ListNode(newVal, cur.next);
            cur.next = newNode;
            cur = newNode.next;
        }

        return head;
    }

    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
}

// next가 null 일때까지 반복문을 돌린다

// next value를 꺼내서 현재 노드의 value와 다음 노드의 value의 greatest divisor를 찾는다

// 새 객체를 생성하고 꺼내놓은 노드를 next로 설정 후 다시 집어 넣는다